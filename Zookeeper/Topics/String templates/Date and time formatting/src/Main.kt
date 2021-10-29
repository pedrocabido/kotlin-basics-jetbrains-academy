fun main() {
    // write your code here
    val hour = readLine()!!.split(" ")
    // val hour = readLine()!!
    val date = readLine()!!.split(" ")
    // val date = readLine()!!
    println("${hour[0]}:${hour[1]}:${hour[2]} ${date[0]}/${date[1]}/${date[2]}")
    // println("${hour.replace(" ", ":")} ${date.replace(" ", "/")}")
}