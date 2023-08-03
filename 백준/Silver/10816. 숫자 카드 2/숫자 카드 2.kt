import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var map = mutableMapOf<Int, Int>()
    var result = StringBuilder("")
    
    val cardNum = StringTokenizer(readLine())
    
    repeat(n) {
        val key = cardNum.nextToken().toInt()
        if (map.containsKey(key)) {
            map[key] = map[key]!!.plus(1)
        } else {
            map.set(key, 1)
        }
    }
    
    val m = readLine().toInt()
    
    val resultNum = StringTokenizer(readLine())
    
    repeat(m) {
        var num = 0
        val key = resultNum.nextToken().toInt()
        if (map.containsKey(key)) num = map[key]!!.toInt()
        
        result.append("$num ")
    }
    
    println(result)
    
}