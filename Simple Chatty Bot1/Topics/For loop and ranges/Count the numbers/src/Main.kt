fun main() {
    // put your code here
    val range: IntRange = readLine()!!.toInt()..readLine()!!.toInt()
    val n: Int = readLine()!!.toInt()
    var count: Int = 0

    for (i in range) {
        if (i % n == 0) ++count
    }
    println(count)
}