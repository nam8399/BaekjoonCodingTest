import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var cnt = 3
    var sum = 19
    var checkNum = 11
    
    if(n == 1) {
        println(1)
        return
    } else if(n <= 7) {
        println(2)
        return
    }
    
    while(true) {
        if (n <= sum) break
        else {
            checkNum += 6
            sum += checkNum+1
            cnt ++
        }
    }
    
    println(cnt)
}