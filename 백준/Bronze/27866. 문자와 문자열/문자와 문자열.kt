import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine().toString()
    val n = readLine().toInt()-1
    val result : Char = str[n]
    print(result)
}