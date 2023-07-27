import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()
    
    for (i in 0 until num) {
        var arr = mutableListOf<Int>()
        val str = StringTokenizer(readLine())
        val len = str.nextToken().toInt()
        var idx = str.nextToken().toInt()

        var list = readLine().split(" ")
        var count = 0
        var flag = false

        for (i in 0 until len) arr.add(list[i].toInt())

        while(true) {
            val max = arr.max()
            
            if (idx == 0) flag = true
            
            if (arr[0] == max) {
                arr.removeAt(0)
                count++
                if (flag) {
                    println(count)
                    break
                } else {
                    idx--
                }
            }
            else {
                var num = arr[0]
                arr.removeAt(0)
                arr.add(num)
                
                if(flag) {
                    flag = false
                    idx = arr.size-1
                } else {
                    idx--
                }
            }
        } 
    }
    
    
}