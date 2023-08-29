import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val str = StringTokenizer(readLine())
    var sum = 0
    var result = 0
    var nn = 0
    
    var arr = Array<Int>(n) {0}
    var arrResult = Array<Int>(n) {0}
    
    
    for (i in 0 until n) arr[i] = str.nextToken().toInt()
    
    arr.sort()
    
    for (i in 0 until n) {
        val plus = sum + arr[i]
        result += plus
        arrResult[i] = result
    }
    
    for (i in 0 until n) nn += arrResult[i]
    
    println(nn)
}