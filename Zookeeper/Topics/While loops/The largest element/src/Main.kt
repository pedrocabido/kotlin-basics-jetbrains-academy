fun main() {
    // put your code here
    var largest: Int = 0
    do {
        val num: Int = readLine()!!.toInt()
        if (num > largest) largest = num
    } while (num != 0)
    println(largest)
}