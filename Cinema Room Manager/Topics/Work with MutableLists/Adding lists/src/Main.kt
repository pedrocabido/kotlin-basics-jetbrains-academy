fun main() {
    val firstList = readLine()!!.split(' ').map { it }.toMutableList()
    val secondList = readLine()!!.split(' ').map { it }.toMutableList()
    // do not touch the lines above
    // write your code here
    val joinList = firstList + secondList
    println(joinList.joinToString())
}