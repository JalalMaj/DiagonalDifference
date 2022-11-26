fun diagonalDifference(arr: Array<Array<Int>>): Int {
    // Write your code here
    var diagonalSum1 = 0
    var diagonalSum2=0
    var result = 0

    for(i in 0..arr.size-1){
        for(j in i .. arr[i].size-1){
            if(i==j){
                diagonalSum1 += arr[i][j]
                //println("$i $j with diagonal 1  Sum $diagonalSum1")
            }
            if(j == arr[i].size-1){
               val b = arr.size-1-i
                diagonalSum2 += arr[i][b]
               // println("$i $j with diagonal 2 Sum $diagonalSum2")
            }
        }
    }
    result  = Math.abs(diagonalSum2 - diagonalSum1)
    return result
}

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = Array<Array<Int>>(n, { Array<Int>(n, { 0 }) })

    for (i in 0 until n) {
        arr[i] = readLine()!!.trimEnd().split(" ").map{ it.toInt() }.toTypedArray()
    }

    val result = diagonalDifference(arr)

    println(result)
}