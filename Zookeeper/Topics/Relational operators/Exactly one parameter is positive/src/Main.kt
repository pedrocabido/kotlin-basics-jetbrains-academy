fun main() {
    // put your code here
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val firstPos = a > 0 && b <= 0 && c <= 0
    val secondPos = a <= 0 && b > 0 && c <= 0
    val thirdPos = a <= 0 && b <= 0 && c > 0

    println(firstPos || secondPos || thirdPos)
}