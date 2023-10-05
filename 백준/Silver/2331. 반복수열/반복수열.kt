import java.io.*
import java.util.*
import kotlin.math.*

var result = 0
fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val (n,m) = readLine().split(" ").map {it.toInt()}
    
    var map = HashMap<Int, Int>()
    map.set(n,1)
    
    checkNum(map, n, m)
    
    print(result)
}

public fun checkNum(map : HashMap<Int, Int>, n : Int, m : Int) {
    val chr = n.toString()
    var count = 0
    chr.forEach {
        count += it.toString().toDouble().pow(m).toInt()
    }
    
    if (map.containsKey(count)) {
        result = map[count]!!.toInt()-1
        return
    }
    map.set(count, map.size+1)
    
    checkNum(map, count, m)
}