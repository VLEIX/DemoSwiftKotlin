//
//  ViewController.swift
//  DemoSwiftKotlin-Swift
//
//  Created by Flavio Franco on 6/28/17.
//  Copyright © 2017 VLEIX. All rights reserved.
//

import UIKit

class ViewController: UIViewController {

    @IBOutlet weak var edtInput: UITextField!
    @IBOutlet weak var edtInput2: UITextField!
    @IBOutlet weak var edtResult: UITextField!
    @IBOutlet weak var edtHistorical: UITextView!
    @IBOutlet weak var btnClear: UIButton!
    @IBOutlet weak var btnSubtract: UIButton!
    @IBOutlet weak var btnAdd: UIButton!
    @IBOutlet weak var btnMultiply: UIButton!
    @IBOutlet weak var btnDivide: UIButton!
    @IBOutlet weak var btn0: UIButton!
    @IBOutlet weak var btn1: UIButton!
    @IBOutlet weak var btn2: UIButton!
    @IBOutlet weak var btn3: UIButton!
    @IBOutlet weak var btn4: UIButton!
    @IBOutlet weak var btn5: UIButton!
    @IBOutlet weak var btn6: UIButton!
    @IBOutlet weak var btn7: UIButton!
    @IBOutlet weak var btn8: UIButton!
    @IBOutlet weak var btn9: UIButton!
    
    var number1 :  Double = 0.0
    var number2 :  Double = 0.0
    var resultTemp : Double = 0.0
    
    var results : Array<Result> = []
    
    let util : UtilSwift = UtilSwift()
    
    override func viewDidLoad() {
        super.viewDidLoad()
    }
    
    @IBAction func edtOperation(_ sender: UIButton) {
        if (sender == self.btnSubtract) {
            resultTemp = util.subtract(number1, number2)
        } else if (sender == self.btnAdd) {
            resultTemp = util.add(number1, number2)
        } else if (sender == self.btnMultiply) {
            resultTemp = util.multiply(number1, number2)
        } else if (sender == self.btnDivide) {
            resultTemp = util.divide(number1, number2)
        }
        
        // print result
        let stringResult : String = util.doubleToString(resultTemp)
        self.edtResult.text = stringResult.result()
        
        // add to historical
        var result : Result =  Result()
        result.numberResult = resultTemp
        result.date = Date()
        
        results.append(result);
    }
    
    @IBAction func edtNumberTUI(_ sender: UIButton) {
        if (sender == self.btn0) {
            if (edtInput.text == "") {
                number1 = 0;
                edtInput.text = "0"
            } else {
                number2 = 0;
                edtInput2.text = "0"
            }
        } else if (sender == self.btn1) {
            if (edtInput.text == "") {
                number1 = 1;
                edtInput.text = "1"
            } else {
                number2 = 1;
                edtInput2.text = "1"
            }
        } else if (sender == self.btn2) {
            if (edtInput.text == "") {
                number1 = 2;
                edtInput.text = "2"
            } else {
                number2 = 2;
                edtInput2.text = "2"
            }
        } else if (sender == self.btn3) {
            if (edtInput.text == "") {
                number1 = 3;
                edtInput.text = "3"
            } else {
                number2 = 3;
                edtInput2.text = "3"
            }
        } else if (sender == self.btn4) {
            
        } else if (sender == self.btn5) {
            
        } else if (sender == self.btn6) {
            
        } else if (sender == self.btn7) {
            
        } else if (sender == self.btn8) {
            
        } else if (sender == self.btn9) {
            
        }
    }
    
    @IBAction func edtClearTUI(_ sender: UIButton) {
        self.edtInput.text = ""
        self.edtInput2.text = ""
        self.edtResult.text = ""
        self.number1 = 0.0
        self.number2 = 0.0
    }
    
    @IBAction func btnHistoricalTUI(_ sender: UIButton) {
        self.edtHistorical.text = util.historical(results)
    }
}

