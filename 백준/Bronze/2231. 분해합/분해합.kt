import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    
    val len = n.toString().length
    var ans = 0
    
    for (i in n-(9*len)..n) {
        val str = i.toString()
        var sum = 0
        
        str.forEach {
            sum += Character.getNumericValue(it)
        }
        
        if (i + sum == n) {
            ans = i
            print(ans)
            break
        }
    }
    
    if (ans == 0) print(ans)
    
    
}