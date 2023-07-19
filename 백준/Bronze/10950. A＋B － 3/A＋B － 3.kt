import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    
    for (i in 1..n) {
        val num = StringTokenizer(readLine())
        val a = num.nextToken().toInt()
        val b = num.nextToken().toInt()
        
        println(a+b)
    }
}