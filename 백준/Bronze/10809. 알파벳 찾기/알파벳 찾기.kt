import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine().toString()
    val map = mutableMapOf<Char, Int>('a' to -1, 'b' to -1, 'c' to -1, 'd' to -1, 'e' to -1, 'f' to -1,
                                     'g' to -1, 'h' to -1, 'i' to -1, 'j' to -1, 'k' to -1, 'l' to -1,
                                     'm' to -1, 'n' to -1, 'o' to -1, 'p' to -1, 'q' to -1, 'r' to -1,
                                     's' to -1, 't' to -1, 'u' to -1, 'v' to -1, 'w' to -1, 'x' to -1,
                                     'y' to -1, 'z' to -1)
    
   var result = ""
   var index = 0
    
    str.forEach {
        if (map[it] == -1) {
            map[it] = index
        }
        
        index++
    }
    
    map.forEach {
        key, value -> result += "$value "
    }
    
    print(result.substring(0 until result.length-1))
    
}