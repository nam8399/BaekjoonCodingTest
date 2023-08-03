import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    
    for (i in 0 until n) {
        val str = readLine()
        
        var arr = mutableListOf<Char>()
        
        run breaker@{
            str.forEach {
                arr.add(it)
                if (it == ')') {
                    arr.removeAt(arr.size-1)

                    if (arr.size == 0) {
                        println("NO")
                        return@breaker
                    } else arr.removeAt(arr.size-1)
                }
            } 
            
            if (arr.size == 0) println("YES")
            else println("NO")
        }
    }
    
    
}