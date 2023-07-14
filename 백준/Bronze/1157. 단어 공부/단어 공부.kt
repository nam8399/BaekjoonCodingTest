import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var str = readLine().toString()
    var map = mutableMapOf<Char, Int>()
    
    str.forEach {
        val char = it.toLowerCase()
        
        if (map.containsKey(char)) {
            map[char] = map[char]!!.plus(1)
        } else {
            map.set(char, 1)
        }
    }
    
    val max = map.maxBy {it.value}
    
    if (map.filter {it.value == max!!.value}.count() > 1) {
        print("?")
    } else {
        print(max!!.key.toUpperCase())
    }
}