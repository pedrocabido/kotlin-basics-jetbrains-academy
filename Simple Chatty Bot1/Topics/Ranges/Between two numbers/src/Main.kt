fun main() {
    // write your code here
    val input: Int = readLine()!!.toInt()
    val range = readLine()!!.toInt()..readLine()!!.toInt()
    println(input in range)
}