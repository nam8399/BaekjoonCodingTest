import java.io.*
import java.util.*

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val num = readLine().toString().replace(" ", "")
    
    if (num.equals("12345678")) {
        print("ascending")
    } else if(num.equals("87654321")) {
        print("descending")
    } else {
        print("mixed")
    }
}