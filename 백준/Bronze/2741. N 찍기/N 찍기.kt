import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()
    
    for (i in 1 .. num) {
        println(i.toString())
    }
}