import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var (n, m, b) = readLine().split(" ").map {it.toInt()}
    
    var arr = Array<Array<Int>>(n) { Array<Int>(m) {0} }
    var min = Int.MAX_VALUE
    var sum = 0
    var height = 0
    
    for (i in 0 until n) {
        val str = StringTokenizer(readLine())
        for (j in 0 until m) {
            arr[i][j] = str.nextToken().toInt()
            sum += arr[i][j]
        }
    }
    
    var max = if ((sum+b)/(n*m) > 256) 256 else (sum+b)/(n*m)
    
    for (i in 0 .. max) {
        var cnt = 0
        for (j in 0 until n) {
            for (k in 0 until m) {
                if (i > arr[j][k]) cnt += i-arr[j][k]
                else if (arr[j][k] > i) cnt += (arr[j][k]-i)*2
            }
        }
        
        if (cnt <= min) {
            min = cnt
            height = i
        }
    }
    
    println("$min $height")
    
}