import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    var wrt = BufferedWriter(OutputStreamWriter(System.out))
    var (n, m, b) = readLine().split(" ").map { it.toInt() }
    
    var arr = Array<Array<Int>>(n) { Array<Int>(m) {0} }
    
    var min = Int.MAX_VALUE
    var height = 0
    var sum = 0
    
    for (i in 0 until n) {
        val str = StringTokenizer(readLine())
        for (j in 0 until m) {
            arr[i][j] = str.nextToken().toInt()
            sum += arr[i][j]
        }
    }
    
    height = if((sum + b)/(n*m) >= 256) 256 else (sum + b)/(n*m)
    
    for (i in 0 .. height) {
        var time = 0
        for (j in 0 until n) {
            for (k in 0 until m) {
                if (arr[j][k] < i) time += i-arr[j][k]
                else if (arr[j][k] > i) time += (arr[j][k]-i)*2
            }
        }
        
        if (min >= time) {
            min = time
            height = i
        }
    }
    
    wrt.write(min.toString() + " " + height.toString())
    
    wrt.flush()
    wrt.close()
}