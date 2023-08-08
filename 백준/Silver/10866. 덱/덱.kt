import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val wrt = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var list = LinkedList<Int>()
    
    repeat(n) {
        val str = StringTokenizer(readLine())
        when (str.nextToken()) {
            "push_front" -> list.addFirst(str.nextToken().toInt())
            "push_back" -> list.add(str.nextToken().toInt())
            "pop_front" -> {
                if (list.size == 0) wrt.write("-1\n")
                else {
                   wrt.write(list.get(0).toString() + "\n")
                   list.removeAt(0) 
                }
            }
            "pop_back" -> {
                if (list.size == 0) wrt.write("-1\n")
                else {
                   wrt.write(list.get(list.size-1).toString() + "\n")
                   list.removeAt(list.size-1) 
                }
            }
            "size" -> wrt.write(list.size.toString() + "\n")
            "empty" -> if (list.size == 0) wrt.write("1\n") else wrt.write("0\n")
            "front" -> if (list.size == 0) wrt.write("-1\n") else wrt.write(list.get(0).toString() + "\n")
            "back" -> if (list.size == 0) wrt.write("-1\n") else wrt.write(list.get(list.size-1).toString() + "\n")
        }
    }

    wrt.close()
}