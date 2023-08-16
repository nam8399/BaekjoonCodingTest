import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var list = mutableListOf<Int>()
    var result = 0
    
    repeat(n) {
        val num = readLine().toInt()
        
        when(num) {
            0 -> list.removeAt(list.size-1)
            else -> list.add(num)
        }
    }
    
    for (i in 0 until list.size) result += list.get(i)
    
    println(result)
}