import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine()
    val str = readLine()
    var result = 0
    
    str.forEach {
        result += Character.getNumericValue(it)
    }
    
    print(result)
}