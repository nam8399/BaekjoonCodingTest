import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val wrt = BufferedWriter(OutputStreamWriter(System.out))
    val num = readLine().toInt()
    
    var arr = Array(15) {IntArray(16)}
    
    for (i in 0 until 15) {
        for (j in 1 .. 15) {
            if (j == 0) {
                arr[i][j] = 1
                continue
            } else if (i == 0) {
                arr[i][j] = j
                continue
            }
            
            var count = 0
            for (k in 0 .. j) count += arr[i-1][k]
            
            arr[i][j] = count
        }
    }
    
    for (i in 0 until num) {
        val k = readLine().toInt()
        val n = readLine().toInt()
        
        wrt.write(arr[k][n].toString() + "\n")
    }
    
    wrt.close()
    
}