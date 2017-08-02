package financialcontrolcashier.android.gooodk.com.demoswiftkotlin_kotlin

import java.util.ArrayList

/**
 * Created by Flavio Franco Tunqui (VLEIX) on 6/28/17.
 *
 */
class UtilKotlin {
    fun subtract(number1: Double, number2: Double): Double {
        val result = number1 - number2
        return result
    }

    fun add(number1: Double, number2: Double): Double {
        val result = number1 + number2
        return result
    }

    fun multiply(number1: Double, number2: Double): Double {
        val result = number1 * number2
        return result
    }

    fun divide(number1: Double, number2: Double): Double {
        val result = number1 / number2
        return result
    }

    fun stringToDouble(string: String): Double? {
        return java.lang.Double.parseDouble(string)
    }

    fun doubleToString(doubleValue: Double?): String {
        return doubleValue.toString()
    }

    fun historical(results: ArrayList<Result>): String {
        var historical = ""
        val count = results.size
        for (i in 0..count - 1) {
            historical = "${historical} \n ${results[i].numberResult} ${results[i].date}"
        }

        return historical
    }
}
