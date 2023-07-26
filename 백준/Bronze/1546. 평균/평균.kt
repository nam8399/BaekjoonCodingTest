import java.io.*
import java.util.*
import kotlin.math.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    
    var arr = Array(n) {0.0}
    
    val list = readLine().split(" ")
    
    for (i in 0 until n) arr[i] = list[i].toDouble()
    
    var max = arr.max().toDouble()
    
    for (i in 0 until n) arr[i] = round(arr[i]/max*100000000)/1000000
    
    print(round(arr.average()*1000000)/1000000)
    
}