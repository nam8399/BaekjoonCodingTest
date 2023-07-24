import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    while(true) {
        val str = readLine().toString()
        if (str == "0") break
        
        println(if(str == str.reversed()) "yes" else "no")
        
    }
}