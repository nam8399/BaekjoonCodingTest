import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val map = mutableMapOf<Int, Int>()
    
    for (i in 1..10) {
        val n = (readLine().toInt())%42
        if (map.containsKey(n)) {
            map[n] = map[n]!!.plus(1)
        } else {
            map.set(n,1)
        }
    }
    
    print(map.size)
}