import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while(true) {
        val list = StringTokenizer(readLine())

        var arr = IntArray(3) {0}
        
        for(i in 0 until 3) arr[i] = list.nextToken().toInt()
        
        if (arr[0] + arr[1] + arr[2] == 0) break
        
        var result = arr.sorted()
        
        if (result[0]*result[0] + result[1]*result[1] == result[2]*result[2]) println("right")
        else println("wrong")
    }
}