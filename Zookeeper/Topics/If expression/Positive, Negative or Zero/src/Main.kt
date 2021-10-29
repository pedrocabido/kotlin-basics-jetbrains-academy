fun main() {
    // write your code here
    val input = readLine()!!.toInt()
    println(if (input > 0) "positive" else if (input < 0) "negative" else "zero")
}