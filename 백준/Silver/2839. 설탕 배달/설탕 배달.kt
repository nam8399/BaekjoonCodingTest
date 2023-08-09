import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val wrt = BufferedWriter(OutputStreamWriter(System.out))
    
    val n = readLine().toInt()
    
    var result = 1
    
    for (i in n/5 downTo 0) {
            result = i
            val num = n-(5*result)
            
            if (num == 0) break 
            else if (num % 3 == 0) {
                result += num/3
                break
            } else if (i == 0 && num != 0) result = -1
    }
    
    println(result)
}