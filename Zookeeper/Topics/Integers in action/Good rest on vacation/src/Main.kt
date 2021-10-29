fun main() {
    // put your code here
    val durationDays = readLine()!!.toInt()
    val foodCostDay = readLine()!!.toInt()
    val flightCost = readLine()!!.toInt()
    val nightCost = readLine()!!.toInt()

    println(foodCostDay * durationDays + flightCost * 2 + nightCost * (durationDays - 1))
}