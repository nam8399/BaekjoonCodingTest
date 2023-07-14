import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var num = readLine().toInt()
    var str = "*"
    
    for (i in 0 until num) {
        println(str)
        str += "*"
    }
}