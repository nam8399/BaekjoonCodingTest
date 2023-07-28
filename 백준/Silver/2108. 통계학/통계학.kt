import java.io.*
import java.util.*
import kotlin.math.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    var arr = Array(n) {0}
    var map = mutableMapOf<Int, Int>()
    var maxCntArr = mutableListOf<Int>()
    
    for (i in 0 until n) {
        val num = readLine().toInt()
        arr[i] = num
        if (map.containsKey(num)) map[num] = map[num]!!.plus(1) 
        else map.set(num, 1)
    }
    
    var array = arr.sorted()
    
    
    var numCntMax = map.maxBy{it.value}.toString().split("=").get(1).toInt()
    var maxNumCnt = map.filter {it.value == numCntMax}.count()
    var list = array.toSet()
     
    
    list.forEach {
        if (map[it] == numCntMax) maxCntArr.add(it)
   	}
    
    println(round(array.average()).toInt())
    if (n == 1) println(array[0])
    else println(array[n/2])
    
    if (maxNumCnt > 1) println(maxCntArr.get(1))
    else println(maxCntArr.get(0))
    println(array.max()-arr.min())
}