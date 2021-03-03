fun main() {
    val phoneNumber = "0345 48523 4859633"
   // printArr(phoneNumber)
    println("Result: " + convertNumbersToWords(Language.SL, phoneNumber))
}

fun printArr(number: String) {
    for (i in number.indices) {
        println("Iteration: $i  Char: ${number[i]}")
    }
}

fun getSLNumbersWordsPairs(): MutableList<Pair<String, String>> {
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

fun getENNumbersWordsPairs(): MutableList<Pair<String, String>> {
    val list = mutableListOf<Pair<String, String>>()
    list.add(Pair("1", "one"))
    list.add(Pair("2", "two"))
    list.add(Pair("3", "three"))
    list.add(Pair("4", "four"))
    list.add(Pair("5", "five"))
    list.add(Pair("6", "six"))
    list.add(Pair("7", "seven"))
    list.add(Pair("8", "eight"))
    list.add(Pair("9", "nine"))
    list.add(Pair("0", "zero"))
    return list
}

fun convertNumbersToWords(languageType: Language, numberValue: String): String {
    var numbersAsWords = ""
    if(numberValue.isEmpty()) return numbersAsWords

    val input = when (languageType) {
        Language.SL -> {
            getSLNumbersWordsPairs()
        }
        Language.EN -> {
            getENNumbersWordsPairs()
        }
    }

    for (i in numberValue.indices) {
        val pair = input.find { it.first == numberValue[i].toString() }
        println("Index: $i  Char: ${numberValue[i]} Pair: $pair")
        if(pair != null) {
            numbersAsWords += pair.second
        }
        numbersAsWords += " "
    }
    return numbersAsWords
}
