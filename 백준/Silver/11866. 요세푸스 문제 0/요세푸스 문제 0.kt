import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val wrt = BufferedWriter(OutputStreamWriter(System.out))
    
    var list = mutableListOf<Int>()
    var result = ""
    
    val str = StringTokenizer(readLine())
    val N = str.nextToken().toInt()
    val K = str.nextToken().toInt()
    
    val queue = LinkedList<Int>()
    
    for (i in 1 .. N) queue.add(i)
    
    while(queue.size != 0) {
        for (i in 0 until K-1) {
            queue.add(queue.get(0))
            queue.removeAt(0)
        }
        
        list.add(queue.get(0))
        queue.removeAt(0)
    }

    result = list.toString().replace("[","<")
    result = result.toString().replace("]",">")
    
    wrt.write(result)
    
    wrt.flush()
    wrt.close()
    
}