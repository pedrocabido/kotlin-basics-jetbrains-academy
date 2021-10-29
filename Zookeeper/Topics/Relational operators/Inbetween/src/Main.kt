fun main() {
    // put your code here
    val one = readLine()!!.toInt()
    val two = readLine()!!.toInt()
    val three = readLine()!!.toInt()

    println(two >= one && one >= three || two <= one && one <= three)
}