import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n,m) = readLine().split(" ").map {it.toInt()}
    
    var arr = Array(n) {IntArray(m)}
    var min = n*m
    
    for (i in 0 until n) {
        val str = readLine()
        var cnt = 0
        str.forEach {
            if ((i+cnt)%2 == 0 && it != 'W' || (i+cnt)%2 == 1 && it != 'B') {
                arr[i][cnt] = 1
            }
            
            if (cnt > 0) arr[i][cnt] += arr[i][cnt-1]
            cnt++
        }
    }
    
    for (i in 0 .. n-8) {
        for (j in 0 .. m-8) {
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