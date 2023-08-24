import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val wrt = BufferedWriter(OutputStreamWriter(System.out))
    val (n,m) = readLine().split(" ").map { it.toInt() }
    var map = mutableMapOf<Int, String>()
    var map2 = mutableMapOf<String, Int>()
    
    for (i in 1 .. n) {
        val str = readLine()
        map.set(i, str)
        map2.set(str, i)
    }
    repeat(m) {
        val str = readLine()
        if(str.get(0).isDigit()) {
          wrt.write(map[str.toInt()] + "\n") 
        } else {
          wrt.write(map2[str].toString() + "\n")
        }
    }
    
    wrt.flush()
    wrt.close()
}