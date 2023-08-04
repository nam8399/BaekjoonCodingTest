import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var list = mutableListOf<Int>()
    
    repeat(n) {
        val str = readLine()
        
        if(str.contains("push")) list.add(str.replace("push ", "").toInt())
        else if (str.contains("pop")) {
            if (list.size == 0) println("-1")
            else {
                println(list.get(list.size-1))
                list.removeAt(list.size-1)
            }
        }
        else if (str.contains("size")) println(list.size)
        else if (str.contains("empty")) if(list.size ==0) println("1") else println("0")
        else if (str.contains("top")) if(list.size == 0) println("-1") else println(list.get(list.size-1))
    }
    
    
}