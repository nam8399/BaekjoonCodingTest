import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val wrt = BufferedWriter(OutputStreamWriter(System.out))
    
    val str = StringTokenizer(readLine())
    
    val A = str.nextToken().toInt()
    val B = str.nextToken().toInt()
    val V = str.nextToken().toInt()
    
    var day = (V - B) / (A - B);
        
	if ((V - B) % (A - B) != 0) day++;
    
    wrt.write(day.toString())
    
    wrt.flush()
    wrt.close()
}