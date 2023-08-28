import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n,k) = readLine().split(" ").map {it.toInt()}
    
    var result = k
    var cnt = 0
    
    var arr = Array<Int>(n) {0}
    
    for (i in 0 until n) arr[i] = readLine().toInt()
    
    arr.sortDescending()
    
    for (i in 0 until n) {
        if (k < arr[i]) continue
        
        cnt += result/arr[i]
        result %= arr[i]
    }
    
    println(cnt)
    
    
}