import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val wrt = BufferedWriter(OutputStreamWriter(System.out))
    val (n, m) = readLine().split(" ").map { it.toInt() }
    var set = HashSet<String>()
    var result = mutableListOf<String>()
    var sb = StringBuilder("")
    
    for (i in 0 until n) set.add(readLine())
    
    repeat(m) {
        val str = readLine()
        if (set.contains(str)) result.add(str)
    }
    
    sb.appendLine(result.size.toString())
    result.sort()
    for(i in 0 until result.size) sb.appendLine(result.get(i))
              
    wrt.write(sb.toString())
    wrt.flush()
    wrt.close()                         
                             
}