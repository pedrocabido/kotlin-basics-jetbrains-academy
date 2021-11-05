fun main() {
    // write your code here
    val num: Int = readLine()!!.toInt()
    var min: Int = readLine()!!.toInt()
    for (i in 1 until num) {
        val input: Int = readLine()!!.toInt()
        if (input < min) min = input
    }
    println(min)
}