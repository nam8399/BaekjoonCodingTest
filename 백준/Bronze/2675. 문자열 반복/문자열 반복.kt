import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    
    for(i in 0 until n) {
        val str = StringTokenizer(readLine().toString())
        val num = str.nextToken().toInt()
        val text = str.nextToken().toString()
        
        var result = ""
        
        text.forEach {
            for(j in 0 until num) {
                result+=it.toString()
            }
        }
        
        println(result)
    }
}