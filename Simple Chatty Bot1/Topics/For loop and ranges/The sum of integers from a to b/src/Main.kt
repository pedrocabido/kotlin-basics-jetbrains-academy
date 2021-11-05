fun main() {
    val range: IntRange = readLine()!!.toInt()..readLine()!!.toInt()
    var sum: Int = 0
    for (i in range) sum += i
    println(sum)
}