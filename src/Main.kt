fun main() {
    val phoneNumber = "0345 48523 4859633"
   // printArr(phoneNumber)
    println("Result: " + convertNumbersToWords(phoneNumber))
}

fun printArr(number: String) {
    for (i in number.indices) {
        println("Iteration: $i  Char: ${number[i]}")
    }
}

fun getNumbersWordsPairs(): MutableList<Pair<String, String>> {
    val list = mutableListOf<Pair<String, String>>()
    list.add(Pair("1", "ena"))
    list.add(Pair("2", "dva"))
    list.add(Pair("3", "tri"))
    list.add(Pair("4", "stiri"))
    list.add(Pair("5", "pet"))
    list.add(Pair("6", "sest"))
    list.add(Pair("7", "sedem"))
    list.add(Pair("8", "osem"))
    list.add(Pair("9", "devet"))
    list.add(Pair("0", "nic"))
    return list
}

fun convertNumbersToWords(number: String): String {
    var wordNumber = ""
    if(number.isEmpty()) return wordNumber
    for (i in number.indices) {
        val pair = getNumbersWordsPairs().find { it.first == number[i].toString() }
        println("Iteration: $i  Char: ${number[i]} Pair: $pair")
        if(pair != null) {
            wordNumber += pair.second
        }
        wordNumber += " "
    }
    return wordNumber
}
