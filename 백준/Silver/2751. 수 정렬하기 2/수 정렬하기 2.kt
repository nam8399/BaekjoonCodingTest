import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val wrt = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var arr = LinkedList<Int>()
    
    for (i in 0 until n) arr.add(readLine().toInt())
    
    var result = arr.sorted()
    
    for (i in 0 until n) wrt.write(result[i].toString() + "\n")
    
    wrt.close()
}