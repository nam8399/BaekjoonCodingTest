import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val wrt = BufferedWriter(OutputStreamWriter(System.out))
    
    val n = readLine().toInt()
    var list = LinkedList<Int>()
    var pos = 1
    var sb = StringBuilder("")
    
    repeat(n) {
        val num = readLine().toInt()
        
        while(num >= pos) {
            sb.append("+\n")
            list.add(pos)
            pos++
        }
        
        if (list.get(list.size - 1) == num) {
            list.removeAt(list.size-1)
            sb.append("-\n")
        } else {
            println("NO")
            return
        }
    }
    
    wrt.write(sb.toString())
    
    wrt.flush()
    wrt.close()
}