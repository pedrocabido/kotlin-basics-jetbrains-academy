fun main() {
    // put your code here
    var ch1 = readLine()!!.first()
    var ch2 = readLine()!!.first()
    val ch3 = readLine()!!.first()

    println(++ch1 == ch2 && ++ch2 == ch3)
}