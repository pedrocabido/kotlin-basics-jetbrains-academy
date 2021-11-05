// write your code here
import kotlin.math.abs
fun getLastDigit(number: Int): Int = abs(number % 10)
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}