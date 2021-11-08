package cinema

fun main() {
    // write your code here
    println("Enter the number of rows:")
    val rows = readLine()!!.toInt()
    println("Enter the number of seats in each row:")
    val columns = readLine()!!.toInt()

    // printCinemaRoom(rows, columns)
    printProfit(rows, columns)

}

fun printProfit(rows: Int, columns: Int) {
    val defaultPrice = 10
    val promoPrice = 8
    val numberOfSeats = rows * columns

    println("Total income:")
    if (numberOfSeats <= 60) {
        println("\$${numberOfSeats * defaultPrice}")
    } else {
        val defaultRows = rows / 2
        val promoRows = defaultRows + rows % 2
        println("\$${columns * defaultRows * defaultPrice + columns * promoRows * promoPrice}")
    }
}

fun printCinemaRoom(rows: Int, columns: Int) {
    println("Cinema:")
    printColumnsHeader(columns)
    printEachRow(rows, columns)
}

fun printColumnsHeader(columns: Int) {
    print("  ")
    for (i in 1..columns) print("$i ")
    println()
}

fun printEachRow(rows: Int, columns: Int) {
    for (i in 1..rows) {
        print("$i ")
        printEachColumn(columns)
        println()
    }
}

fun printEachColumn(columns: Int) {
    for (j in 1..columns){
        print("S ")
    }
}