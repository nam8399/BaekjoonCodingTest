import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val wrt = BufferedWriter(OutputStreamWriter(System.out))
    var num = readLine().toInt()
    
    for (i in 1..num) {
        for (j in num downTo 1) {
            wrt.write(
                if (i >= j) "*"
                else " "
            )
        }
        wrt.write("\n")
    }
    
    wrt.flush()
    wrt.close()
    close()
}