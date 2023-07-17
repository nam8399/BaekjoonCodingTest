import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    
    for (i in 1..n) {
        checkOX(readLine().toString())
    }
}

fun checkOX(str : String) {
    var count = 0
    var flagCnt = 0
    
    str.forEach {
        if (it == 'O') {
            flagCnt += 1
            count += flagCnt
        } else {
            flagCnt = 0
        }
    }
    
    println(count)
}