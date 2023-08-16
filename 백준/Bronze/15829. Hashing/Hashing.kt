import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    
    var str = readLine()
    var result = 0
    var cnt = 0
    
    str.forEach {
        result += (it.toInt()-96) * calculate(cnt) % 1234567891
        cnt ++
    }
    
    print(result)
    
	
}

fun calculate(n : Int) : Int {
    var result = 1
    repeat(n) {
    	result *= 31 % 1234567891    
    }
    
    return result
}