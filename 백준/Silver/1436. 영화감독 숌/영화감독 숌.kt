import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var num = 666
    var count = 0
    while(true) {
        if (num.toString().contains("666")) count++
        
        if (count == n) {
            print(num)
            break
        }
        num++
    }
}