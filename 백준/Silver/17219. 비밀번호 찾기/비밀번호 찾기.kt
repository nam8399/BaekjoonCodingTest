import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n,m) = readLine().split(" ").map { it.toInt() }
    var map = mutableMapOf<String, String>()
    
    for (i in 0 until n) {
        val str = StringTokenizer(readLine())
        map.set(str.nextToken(), str.nextToken())
    }
    
    for (i in 0 until m) println(map[readLine()])
}