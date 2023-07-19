import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    try {
        while(true) {
            val str = StringTokenizer(readLine())
        
            if(str == null) break

            val a = str.nextToken().toInt()
            val b = str.nextToken().toInt()
            
            if (a+b != 0) {         
                println(a+b)   
            }
        }
    } catch(e : Exception) {
        
    }
}