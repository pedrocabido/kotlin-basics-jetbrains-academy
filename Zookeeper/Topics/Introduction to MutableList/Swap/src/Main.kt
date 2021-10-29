fun main() {    
    val numbers = readLine()!!.split(' ').map { it.toInt() }.toMutableList()
    // Do not touch lines above
    // Write only exchange actions here.
    val elemN = numbers.last()
    val elem0 = numbers.first()
    numbers[numbers.size - 1] = elem0
    numbers[0] = elemN

    // Do not touch lines below
    println(numbers.joinToString(separator = " "))
}