import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n1 = readLine().toInt()
    val n2 = readLine().toInt()
    val n3 = readLine().toInt()
    
    val num = (n1*n2*n3).toString()
    var map = mutableMapOf<Int, Int>()
    
    num.forEach {
        val key = Character.getNumericValue(it)
        if (map.containsKey(key)) {
            map[key] = map[key]!!.plus(1)
        } else {
            map.set(key, 1)
        }    
    }
    
    for(i in 0..9) {
        if (map.containsKey(i)) {
            println(map[i]!!.toInt())
        } else {
            println(0)
        }
    }
}