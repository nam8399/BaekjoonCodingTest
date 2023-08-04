import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val wrt = BufferedWriter(OutputStreamWriter(System.out))
    val n = readLine().toInt()
    var list = mutableListOf<Int>()
    
    repeat(n) {
        val str = readLine()
        when (str) {
            "pop" -> {
                if (list.size == 0) wrt.write("-1\n")
                else {
                   wrt.write(list.get(0).toString() + "\n")
                   list.removeAt(0) 
                }
                
            }
            "size" -> wrt.write(list.size.toString() + "\n")
            "empty" -> if (list.size == 0) wrt.write("1\n") else wrt.write("0\n")
            "front" -> if (list.size == 0) wrt.write("-1\n") else wrt.write(list.get(0).toString() + "\n")
            "back" -> if (list.size == 0) wrt.write("-1\n") else wrt.write(list.get(list.size-1).toString() + "\n")
            else -> list.add(str.replace("push ", "").toInt())
        }
    }
    
    wrt.close()
}