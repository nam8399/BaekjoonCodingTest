import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val str = StringTokenizer(readLine())

    val a = str.nextToken().toInt()
    val b = str.nextToken().toInt()
    
    println(a*b)   
}