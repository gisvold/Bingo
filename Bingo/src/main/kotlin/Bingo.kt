var alreadyDrawn = arrayListOf(
    
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
