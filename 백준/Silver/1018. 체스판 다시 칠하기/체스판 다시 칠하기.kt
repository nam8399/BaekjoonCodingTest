import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = StringTokenizer(readLine())
    
    val row = str.nextToken().toInt()
    val col = str.nextToken().toInt()
    
    var arr = Array(row) {IntArray(col)}
    
    var min =  row * col
    
    for (i in 0 until row) {
        val line = readLine().toCharArray()
        
        for (j in 0 until col) {
            if ((i+j)%2 == 0 && line[j] != 'W' ||
               (i+j)%2!=0 && line[j] != 'B') {
                arr[i][j]++
            }
            
            if(j > 0) arr[i][j] += arr[i][j-1]
        }
    }
    
    
    for (i in 0 .. row-8) {
        for (j in 0 .. col-8) {
            var count = 0
            
            for (k in i until i+8) {
                count += arr[k][j+7]
                
                if (j > 0) count -= arr[k][j-1]
            }
            
            if (count > 64 - count) count = 64 - count
            if (count < min) min = count
        }
    }
    
    print(min)
}