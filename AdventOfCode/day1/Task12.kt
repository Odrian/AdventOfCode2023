package day1

import java.util.Scanner

fun replace(line: String): String {
    /** need to add the name of a digit before and after
     *  because otherwise "oneight" will be "1ight" not "18" */
    return line
        .replace("one", "one1one")
        .replace("two", "two2two")
        .replace("three", "three3three")
        .replace("four", "four4four")
        .replace("five", "five5five")
        .replace("six", "six6six")
        .replace("seven", "seven7seven")
        .replace("eight", "eight8eight")
        .replace("nine", "nine9nine")
}

fun main() {
    val sc = Scanner(System.`in`)
    var sum = 0

    val isNum = {c: Char -> c.isDigit()}
    while (sc.hasNext()) {
        var line = sc.next()
        line = replace(line) // need it for the second task of day 1

        val a = line.find(isNum)!!.minus('0')
        val b = line.findLast(isNum)!!.minus('0')
        sum += a*10 + b
    }

    println(sum)
}
