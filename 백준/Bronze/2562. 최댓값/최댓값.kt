import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var map = mutableMapOf<Int, Int>()
    
    for (i in 1 until 10) {
        map.set(i,readLine().toInt())
    }
    
    var max = map.maxBy{it.value}
    
    println(max!!.value)
    println(max!!.key)
}