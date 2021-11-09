fun main() {
    // write your code here
    val size: Int = readLine()!!.toInt()
    val intList: MutableList<Int> = mutableListOf()
    for (i in 0 until size) {
        intList.add(readLine()!!.toInt())
    }
    var countTriple = 0
    for (i in 0 until intList.size - 2) {
        if (intList[i] + 1 == intList[i+1] && intList[i] + 2 == intList[i+2]) {
            ++countTriple
        }
    }
    println(countTriple)
}