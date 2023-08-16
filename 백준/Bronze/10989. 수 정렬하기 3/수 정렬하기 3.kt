import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val wrt = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var list = IntArray(n) {0}
    
    for(i in 0 until n) list[i] = readLine().toInt()
    
    list.sort()
    
    for (i in 0 until n) wrt.write(list.get(i).toString() + "\n")
    
    wrt.flush()
    wrt.close()
}