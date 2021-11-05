fun main() {
    // write your code here
    val range1 = createRange()
    val range2 = createRange()
    val input: Int = readLine()!!.toInt()
    println(input in range1 || input in range2)
}

fun createRange(): IntRange {
    return readLine()!!.toInt()..readLine()!!.toInt()
}