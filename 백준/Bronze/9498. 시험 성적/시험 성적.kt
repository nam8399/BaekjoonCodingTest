import java.util.*
import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    
    when {
        n > 89 -> println("A")
        n > 79 -> println("B")
        n > 69 -> println("C")
        n > 59 -> println("D")
        else -> println("F")
    }
}