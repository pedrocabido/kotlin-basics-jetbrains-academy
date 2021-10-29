fun main() {
    // put your code here
    var countPositive: Int = 0
    repeat(readLine()!!.toInt()) {
        if (readLine()!!.toInt() > 0) ++countPositive
    }
    println(countPositive)
}