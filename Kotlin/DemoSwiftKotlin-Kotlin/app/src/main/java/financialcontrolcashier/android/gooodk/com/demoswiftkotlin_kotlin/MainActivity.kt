package financialcontrolcashier.android.gooodk.com.demoswiftkotlin_kotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

import java.util.ArrayList
import java.util.Date

class MainActivity : AppCompatActivity() {

    private var edtInput: EditText? = null
    private var edtInput2: EditText? = null
    private var edtResult: EditText? = null
    private var edtHistorical: TextView? = null
    private var btnHistorical: Button? = null
    private var btnClear: Button? = null
    private var btnSubtract: Button? = null
    private var btnAdd: Button? = null
    private var btnMultiply: Button? = null
    private var btnDivide: Button? = null
    private var btn0: Button? = null
    private var btn1: Button? = null
    private var btn2: Button? = null
    private var btn3: Button? = null
    private var btn4: Button? = null
    private var btn5: Button? = null
    private var btn6: Button? = null
    private var btn7: Button? = null
    private var btn8: Button? = null
    private var btn9: Button? = null

    internal var number1: Double = 0.0
    internal var number2: Double = 0.0
    internal var resultTemp: Double = 0.0

    internal var results = ArrayList<Result>()

    internal var util = UtilKotlin()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtInput = findViewById(R.id.edtInput) as EditText
        edtInput2 = findViewById(R.id.edtInput2) as EditText
        edtResult = findViewById(R.id.edtResult) as EditText
        edtHistorical = findViewById(R.id.edtHistorical) as TextView
        btnHistorical = findViewById(R.id.btnHistorical) as Button
        btnClear = findViewById(R.id.btnClear) as Button
        btnSubtract = findViewById(R.id.btnSubtract) as Button
        btnAdd = findViewById(R.id.btnAdd) as Button
        btnMultiply = findViewById(R.id.btnMultiply) as Button
        btnDivide = findViewById(R.id.btnDivide) as Button
        btn0 = findViewById(R.id.btn0) as Button
        btn1 = findViewById(R.id.btn1) as Button
        btn2 = findViewById(R.id.btn2) as Button
        btn3 = findViewById(R.id.btn3) as Button
        btn4 = findViewById(R.id.btn4) as Button
        btn5 = findViewById(R.id.btn5) as Button
        btn6 = findViewById(R.id.btn6) as Button
        btn7 = findViewById(R.id.btn7) as Button
        btn8 = findViewById(R.id.btn8) as Button
        btn9 = findViewById(R.id.btn9) as Button

        btnSubtract!!.setOnClickListener {
            resultTemp = util.subtract(number1, number2)

            setResult()
        }

        btnAdd!!.setOnClickListener {
            resultTemp = util.add(number1, number2)

            setResult()
        }

        btnMultiply!!.setOnClickListener {
            resultTemp = util.multiply(number1, number2)

            setResult()
        }

        btnDivide!!.setOnClickListener {
            resultTemp = util.divide(number1, number2)

            setResult()
        }

        btn0!!.setOnClickListener {
            if (edtInput!!.text.toString() == "") {
                number1 = 0.0
                edtInput!!.setText("0")
            } else {
                number2 = 0.0
                edtInput2!!.setText("0")
            }
        }

        btn1!!.setOnClickListener {
            if (edtInput!!.text.toString() == "") {
                number1 = 1.0
                edtInput!!.setText("1")
            } else {
                number2 = 1.0
                edtInput2!!.setText("1")
            }
        }

        btn2!!.setOnClickListener {
            if (edtInput!!.text.toString() == "") {
                number1 = 2.0
                edtInput!!.setText("2")
            } else {
                number2 = 2.0
                edtInput2!!.setText("2")
            }
        }

        btn3!!.setOnClickListener {
            if (edtInput!!.text.toString() == "") {
                number1 = 3.0
                edtInput!!.setText("3")
            } else {
                number2 = 3.0
                edtInput2!!.setText("3")
            }
        }

        btnClear!!.setOnClickListener {
            edtInput!!.setText("")
            edtInput2!!.setText("")
            edtResult!!.setText("")
            number1 = 0.0
            number2 = 0.0
        }

        btnHistorical!!.setOnClickListener { edtHistorical!!.text = util.historical(results) }
    }

    private fun setResult() {
        val stringResult = util.doubleToString(resultTemp)
        edtResult!!.setText(stringResult.result)

        // add to historical
        var result : Result =  Result()
        result.numberResult = resultTemp
        result.date = Date()

        results.add(result)
    }
}
