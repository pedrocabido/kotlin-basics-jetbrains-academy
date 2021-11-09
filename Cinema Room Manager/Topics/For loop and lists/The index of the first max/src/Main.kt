fun main() {
    // write your code here
    val size: Int = readLine()!!.toInt()
    val intList: MutableList<Int> = mutableListOf()
    for (i in 0 until size) {
        intList.add(readLine()!!.toInt())
    }
    var max: Int = 0
    var ind: Int = 0
    for (i in intList.indices) {
        if (intList[i] > max) {
            max = intList[i]
            ind = i
        }
    }
    println(ind)
}