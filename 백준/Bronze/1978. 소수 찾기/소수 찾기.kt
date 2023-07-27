import java.io.*
import java.util.*
import kotlin.math.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val str = StringTokenizer(readLine())
    
    var arr = Array(n) {0}
    var count = 0
    
    for (i in 0 until n) arr[i] = str.nextToken().toInt()
    
    val max = arr.max()
    var decArr = Array(max+1) {true}
    decArr[0] = false
    decArr[1] = false
    
    for (i in 2 .. sqrt(max+1.toDouble()).toInt()) {
        var j = 2
        
        while(i*j <= max) {
            decArr[i*j] = false
            j++
        }
    }
    
    for (i in 0 until n) if(decArr[arr[i]]) count++
    
    print(count)
}