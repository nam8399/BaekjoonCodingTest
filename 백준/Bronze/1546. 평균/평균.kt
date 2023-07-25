import java.io.*
import java.util.*
import kotlin.math.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var list = Array(n) {0.0}
    var orglist = readLine().split(" ").toMutableList()
        for (i in 0 until n) {
        list[i] = orglist[i].toDouble()
    }
    
    val max = list.max()

    for (i in 0 until n) {
        list[i] = round(orglist[i].toDouble()/max.toDouble()*1000000)/10000
    }
    
    print(round(list.average()*1000000)/1000000)
}