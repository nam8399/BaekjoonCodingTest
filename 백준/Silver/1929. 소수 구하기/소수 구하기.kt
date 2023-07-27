import java.io.*
import java.util.*
import kotlin.math.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = StringTokenizer(readLine())
    
    val min = str.nextToken().toInt()
    val max = str.nextToken().toInt()
    
    var arr = Array(max+1) {true}
    
    arr[0] = false
    arr[1] = false
    
    for (i in 2 .. sqrt(max+1.toDouble()).toInt()) {
        if (arr[i]) {
            var j = 2
            
            while(i * j <= max) {
                arr[i*j] = false
                j++
            }
        }
    }
    
    for (i in min .. max) {
        if (arr[i]) {
            println(i)
        }
    }
}