import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val arr = Array(n) {readLine().split(" ").toList()}.sortedWith(compareBy({it.get(0).toInt()},{it.get(1).toInt()}))
    
    for (i in 0 until n) println(arr[i].get(0) + " " + arr[i].get(1))
}