var alreadyDrawn = arrayListOf(
    4, 5, 6,
    10, 11, 12, 13, 17,
    23, 24, 25, 27,
    30, 35, 37, 38,
    40, 41, 42, 47, 48,
    50, 52, 53, 54, 56, 57, 59,
    61, 64, 66, 67, 68, 69,
    70, 72, 73, 74, 75
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
   return (0..75).random()
}
