import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val len = readLine()
    val str = readLine().split(" ").map { it.toInt() }
    
    print(str.min().toString() + " " + str.max().toString())
}