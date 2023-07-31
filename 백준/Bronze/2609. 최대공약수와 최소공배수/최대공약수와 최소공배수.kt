import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = StringTokenizer(readLine())
    
    val a = num.nextToken().toLong()
    val b = num.nextToken().toLong()
    
    val gcd = GCD(a, b)
    println(gcd)
    
    println(LCM(a,b,gcd))
    
}

fun GCD(a : Long, b : Long) : Long {
    if (a%b == 0L) return b
    return GCD(b, a%b)
}

fun LCM(a : Long, b : Long, gcd : Long) : Long {
    return((a*b)/gcd)
}