import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
   print(List(readLine().toInt()) {readLine()}.toSet()
         .sortedWith(compareBy({it.length},{it})).joinToString("\n"))
}