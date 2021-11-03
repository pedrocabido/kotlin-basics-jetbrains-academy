fun main() {
    // write your code here
    val input: String = readLine()!!.toString()
    val index: Int = readLine()!!.toInt()

    println("Symbol # $index of the string \"$input\" is '${input[index - 1]}'")
}