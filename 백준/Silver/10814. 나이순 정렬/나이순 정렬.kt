import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val arr = Array(readLine().toInt()) {readLine().split(" ")}.sortedBy {it[0].toInt()}
    arr.forEach { println("${it[0]} ${it[1]}") }
    
}