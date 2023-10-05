import java.io.*
import java.util.*


var count = 0

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    
    for (i in 0 until n) {
        var arr = ArrayList<Int>()
        val m = readLine().toInt()
        val str = StringTokenizer(readLine())
        
        arr.add(0)
        
        for (j in 0 until m) {
            arr.add(str.nextToken().toInt())
        }
        
        for (j in 1 .. m) {
            if (arr[j] == 0) continue
            
            checkCycle(arr, j)
        }
        
        println(count)
        
        count = 0
    }
    
}

public fun checkCycle(arr : ArrayList<Int>, pos : Int) {
    if (arr[pos] == 0) {
        count++
        return
    }
    val num = arr[pos]
    
    arr[pos] = 0
    
    checkCycle(arr, num)
}