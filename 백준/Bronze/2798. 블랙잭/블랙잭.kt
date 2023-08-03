import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = StringTokenizer(readLine())
    
    val n = str.nextToken().toInt()
    val m = str.nextToken().toInt()
    
    val numList = readLine().split(" ")
    
    if (n == 3) println(numList[0].toInt() + numList[1].toInt() + numList[2].toInt())
    else {
        var max = 0

        for (i in 0 until n) {
            for (j in i+1 until n) {
                for (k in j+1 until n) {
                    val sum = numList[i].toInt() + numList[j].toInt() + numList[k].toInt()

                    if (sum == m) {
                        max = sum
                        break
                    }else if (sum < m && sum > max) {
                        max = sum
                    }
                }
            }
        }
        
        println(max)
    }
}