var alreadyDrawn = arrayListOf(
    2, 3, 4, 5, 6, 7, 8, 10, 11, 12, 14, 15,
    16, 17, 18, 20, 21, 22, 23, 25, 26, 27, 28, 29, 30,
    31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44,
    47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60,
    61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75
)

const val sleepTime = 4_000L

fun main() {

    println("I would like to extend a heartfelt welcome to you all!")

    Thread.sleep(sleepTime)
    println("Bingo number #1 of the day is: " + drawBingoNumber(alreadyDrawn))

    Thread.sleep(sleepTime)
    println("Bingo number #2 of the day is: " + drawBingoNumber(alreadyDrawn))

    Thread.sleep(sleepTime)
    println("Bingo number #3 of the day is: " + drawBingoNumber(alreadyDrawn))

}

fun checkAlreadyDrawn(drawnNumber: Int): Boolean {
    return alreadyDrawn.contains(drawnNumber)
}

fun drawBingoNumber(alreadyDrawn: ArrayList<Int>): Int {
    val drawnNumber = getRandom()

    return if (!checkAlreadyDrawn(drawnNumber)){
        alreadyDrawn.add(drawnNumber)
        drawnNumber
    } else {
        drawBingoNumber(alreadyDrawn)
    }
}

fun getRandom(): Int{
   return (1..75).random()
}
