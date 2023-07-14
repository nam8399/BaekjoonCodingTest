import java.io.*
import java.util.*
import kotlin.math.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val str = StringTokenizer(readLine())
    
    var n1 = str.nextToken().toInt()
    var n2 = str.nextToken().toInt()
    var n3 = str.nextToken().toInt()
    var n4 = str.nextToken().toInt()
    var n5 = str.nextToken().toInt()
    
    print(getChkNum(n1, n2, n3, n4, n5))
}

fun getChkNum(n1:Int, n2:Int, n3:Int, n4:Int, n5:Int) : Int {
    var sum = (n1.toFloat()).pow(2) + (n2.toFloat()).pow(2) + (n3.toFloat()).pow(2) + (n4.toFloat()).pow(2) + (n5.toFloat()).pow(2)
    return (sum.toInt()%10)

}