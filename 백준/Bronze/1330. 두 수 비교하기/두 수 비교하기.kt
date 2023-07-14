import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var str = StringTokenizer(readLine())
    
    var num = str.nextToken().toInt()
    var num2 = str.nextToken().toInt()
    
    when {
        (num < num2) -> print("<")
        (num > num2) -> print(">")
        (num == num2) -> print("==")
    }
}