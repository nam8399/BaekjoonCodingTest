import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val fif = Math.round(n.toDouble()*15/100)
    var sum = 0
    var list = LinkedList<Int>()
    
    repeat(n) {
        list.add(readLine().toInt())
    }
    
    list.sort()
    
    repeat(fif.toInt()) {
        list.removeAt(0)
        list.removeAt(list.size-1)
    }
    
    list.forEach {
        sum += it
    }
    
    println(Math.round(sum.toDouble()/list.size).toInt())
}