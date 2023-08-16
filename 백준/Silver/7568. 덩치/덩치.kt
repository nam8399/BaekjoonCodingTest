import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var list = mutableListOf<Pair<Int, Int>>()
    var wList = mutableListOf<Int>()
    var map = mutableMapOf<Int, Int>()
    var result = ""
    
    repeat(n) {
        val str = StringTokenizer(readLine())
        list.add(Pair(str.nextToken().toInt(), str.nextToken().toInt()))
    }
    
    for (i in 0 until n) {
        var fCnt = list.filter {it.first > list.get(i).first && it.second > list.get(i).second}.count()+1
        var sCnt = list.filter {it.first >= list.get(i).first && it.second >= list.get(i).second}.count()+1
        result += "$fCnt "
    }
    
    println(result.substring(0,result.length-1))
}