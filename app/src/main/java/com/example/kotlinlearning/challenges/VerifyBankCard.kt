package com.example.kotlinlearning.challenges

fun main() {
    val verifyBankCard = VerifyBankCard("1121-0000-0000-0312", "(04/24)")
    val isValid = verifyBankCard.checkCompanyCard()
    println(isValid)
}

class VerifyBankCard(cardNumber: String, expirationDate: String) {

    val validCompanyNumber = listOf(1121, 1111, 3796)
    var isValid = false
    val currentYear = 24
    val expirationMonth = expirationDate.slice(1..2)
    val expirationYear = expirationDate.slice(4..5)
    val companyNumber = cardNumber.slice(0..3)


    fun checkCompanyCard(): Boolean {
        for (number in validCompanyNumber) {
            if (companyNumber == number.toString()) {
                isValid = true
                break
            } else {
                return false
            }
        }

        if (expirationYear.toInt() >= currentYear) {
            isValid = true
        } else {
            return false
        }

        if (expirationMonth[0] > '0') {
            isValid = true
        } else {
            return false
        }

        if (expirationMonth[1] > '4') {
            isValid = true
        } else {
            return false
        }

        return isValid

    }
}
