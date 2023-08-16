import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    
    var list = mutableListOf<Pair<Int, Int>>()
    
    for (i in 0 until n) {
        val str = StringTokenizer(readLine())
        
        list.add(Pair(str.nextToken().toInt(), str.nextToken().toInt()))
    }
    
    var result = list.sortedWith(compareBy({it.second}, {it.first}))
    
    for(i in 0 until n) println(result.get(i).first.toString() + " " + result.get(i).second.toString())
}