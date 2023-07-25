import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var i = n
    var count = 0
    while (i >= 5) {
        count += i/5
        i/=5
    }
    
    print(count)
}