import java.util.*
import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = StringTokenizer(readLine())
    
    val K = str.nextToken().toInt()
    val N = str.nextToken().toInt()
    
    var arr = IntArray(K)
    
    for (i in 0 until K) arr[i] = readLine().toInt()
    
    var max = arr.maxOrNull()!!
    var min = 1
    
    var mid = 0
    var answer = 0
    
    while(min <= max) {
        var count = 0
        mid = min + (max-min)/2
        for (i in 0 until K) count += arr[i]/mid
        
        if (count >= N) {
            answer = mid
            if (mid == Int.MAX_VALUE) break
            min = mid+1
        } else {
            max = mid-1
        }
    }
    
    print(answer)
}