import java.util.*
import java.io.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toInt()
    
    for (i in 1 .. 9) {
        println(num.toString() + " * " + i.toString() + " = " + (num*i).toString())
    }
}