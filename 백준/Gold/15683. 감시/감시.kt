import java.util.*
import java.io.*
import kotlin.math.*

data class CCTV(var x : Int, var y : Int, var type : Int)

lateinit var arr : Array<IntArray>
var cctv = ArrayList<CCTV>()
var min = Int.MAX_VALUE
var n = 0
var m = 0


fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    //arr = Array(4) { IntArray(6) }
    
    val str = StringTokenizer(readLine())
    n = str.nextToken().toInt()
    m = str.nextToken().toInt()
    
    arr = Array(n) {IntArray(m)}
    
    for (i in 0 until n) {
        val str = StringTokenizer(readLine())
        
        for (j in 0 until m) {
            val num = str.nextToken().toInt()
            
            if(num in 1..5) {
                cctv.add(CCTV(i,j,num))
            }
            
            arr[i][j] = num
        }
    }
    
    backTracker(arr, 0)
    
    print(min)
}

public fun backTracker(arr : Array<IntArray>, pos : Int) {
    if (cctv.size == pos) {
        val mincount = arr.sumOf { it.count { it2 -> it2 == 0}}
//         for (i in 0 until m) {
// 	        mincount += arr[i].filter { it == 0 }.count()
//         }
        
        min = min(min, mincount)
        return
    }
    
    var max = 0
    
    max = when(cctv[pos].type) {
        1,3,4 -> 4
        2 -> 2
        5 -> 1
        else -> -1
    }
    
    for (i in 0 until max) {
        var copiedArr = Array(n) { x -> IntArray(m) { y -> arr[x][y] } }
//         for (i in arr.indices) {
//         	copiedArr[i] = arr[i].clone()
//     	} 
        when(cctv[pos].type) {
            1 -> playCCTV1(cctv[pos], copiedArr, i)
            2 -> playCCTV2(cctv[pos], copiedArr, i)
            3 -> playCCTV3(cctv[pos], copiedArr, i)
            4 -> playCCTV4(cctv[pos], copiedArr, i)
            5 -> playCCTV5(cctv[pos], copiedArr)
        }
        
        backTracker(copiedArr, pos+1)
    }
    
} 

public fun playCCTV1(cctv : CCTV, arr : Array<IntArray>, num : Int) {
    when(num) {
        0 -> goUp(cctv, arr)
        1 -> goRight(cctv, arr)
        2 -> goDown(cctv, arr)
        3 -> goLeft(cctv, arr)
    }
}

public fun playCCTV2(cctv : CCTV, arr : Array<IntArray>, num : Int) {
    when(num) {
        0 -> {
            goUp(cctv, arr)
            goDown(cctv, arr)
        }
        1 -> {
            goRight(cctv, arr)
            goLeft(cctv, arr)
        }
    }
}

public fun playCCTV3(cctv: CCTV, arr : Array<IntArray>, num : Int) {
    when(num) {
        0 -> {
            goUp(cctv, arr)
            goRight(cctv, arr)
        }
        1 -> {
            goRight(cctv, arr)
            goDown(cctv, arr)
        }
        2 -> {
            goDown(cctv, arr)
            goLeft(cctv, arr)
        }
        3 -> {
            goLeft(cctv, arr)
            goUp(cctv, arr)
        }
    }
}

public fun playCCTV4(cctv: CCTV, arr : Array<IntArray>, num : Int) {
    when(num) {
        0 -> {
            goUp(cctv, arr)
            goRight(cctv, arr)
            goLeft(cctv, arr)
        }
        1 -> {
        	goUp(cctv, arr)
            goRight(cctv, arr)
            goDown(cctv, arr)
        }
        2 -> {
        	goRight(cctv, arr)
            goDown(cctv, arr)
            goLeft(cctv, arr)
        }
        3 -> {
            goDown(cctv, arr)
            goLeft(cctv, arr)
            goUp(cctv, arr)
        }
    }
}

public fun playCCTV5(cctv: CCTV, arr : Array<IntArray>) {
    goDown(cctv, arr)
    goLeft(cctv, arr)
    goUp(cctv, arr)
    goRight(cctv, arr)
}


public fun goRight(p : CCTV, arr : Array<IntArray>) {
    for (y in p.y until m) {
        if (arr[p.x][y] == 6) break
       	arr[p.x][y] = -1
    }
}

public fun goLeft(p : CCTV, arr : Array<IntArray>) {
    for (y in p.y downTo 0) {
        if (arr[p.x][y] == 6) break
       	arr[p.x][y] = -1
    }
}

public fun goUp(p : CCTV, arr : Array<IntArray>) {
    for (x in p.x downTo 0) {
        if (arr[x][p.y] == 6) break
       	arr[x][p.y] = -1
    }
}

public fun goDown(p : CCTV, arr : Array<IntArray>) {
    for (x in p.x until n) {
        if (arr[x][p.y] == 6) break
       	arr[x][p.y] = -1
    }
}




