import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val first = readLine()
    val set = readLine().split(" ").toSet().sorted()
    val second = readLine().toInt()
    val str = StringTokenizer(readLine())
    
    for (i in 0 until second) {
        if (set.binarySearch(str.nextToken()) >= 0) println("1")
        else println("0")
    }
    
}