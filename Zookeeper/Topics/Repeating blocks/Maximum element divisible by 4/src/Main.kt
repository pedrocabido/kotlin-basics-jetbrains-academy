fun main() {
    // put your code here
    var max: Int = 0
    repeat(readLine()!!.toInt()) {
        val num = readLine()!!.toInt()
        if (num % 4 == 0 && num > max) {
            max = num
        }
    }
    println(max)
}