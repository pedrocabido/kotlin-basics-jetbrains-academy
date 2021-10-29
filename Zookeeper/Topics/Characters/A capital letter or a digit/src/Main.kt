fun main() {
    // write your code here
    val ch: Char = readLine()!!.first()
    println(ch.isDigit() && ch != '0' || ch.isUpperCase())
}