fun main() {
    // put your code here
    val room1 = readLine()!!.toInt()
    val room2 = readLine()!!.toInt()
    val room3 = readLine()!!.toInt()

    val totalDesks = countDesks(room1) + countDesks(room2) + countDesks(room3)
    println(totalDesks)
}

private fun countDesks(students: Int): Int {
    return students / 2 + students % 2
}