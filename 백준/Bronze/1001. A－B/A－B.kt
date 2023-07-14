import java.util.*
import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var str = StringTokenizer(readLine())
    
    var a = str.nextToken().toInt()
    var b = str.nextToken().toInt()
    
    print(a-b)
}