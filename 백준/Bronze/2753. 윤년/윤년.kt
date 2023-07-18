import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    
    if (n%4 ==0 && n%100!=0 || n%400==0) {
        print("1")
    } else {
        print("0")
    }
}