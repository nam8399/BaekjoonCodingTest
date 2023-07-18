import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = readLine().toString()
    val arr = Array(30) {-1}
    
   var result = ""
   var index = 0
    
    str.forEach {
        val n = it.toInt() - 'a'.toInt()
        if (arr[n] == -1) {
            arr[n] = index
        }
        
        index++
    }
    
    for (i in 0..25) {
        result += (arr[i].toString() + " ")
    }
    print(result.substring(0 until result.length-1))
    
}