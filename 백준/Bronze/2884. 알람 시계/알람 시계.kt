import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val time = StringTokenizer(readLine())
    
    var hour = time.nextToken().toInt()
    val min = time.nextToken().toInt()
    
    if (hour == 0 && min < 45) hour = 24
    
    val minute = hour*60 + min - 45
    
    val resultHour = ((minute/60).toInt()).toString()
    val resultMinute = (minute%60).toString()
    
    print(resultHour + " " + resultMinute)
    
}