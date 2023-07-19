import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    
    for (i in 1..n) {
        val str = StringTokenizer(readLine())
        val H = str.nextToken().toInt()
        val W = str.nextToken().toInt()
        val N = str.nextToken().toInt()
        
        var n1 = N%H
        var n2 = (N/H)
        
        if(n1!=0) n2+=1
        else {
            n1=H
        }
        
        
        var n3 = n2.toString()
        
        
        if (n2 < 10) {
          n3 = "0" + n3  
        } 
        println(n1.toString()+n3)
    }
}