//
//  UtilSwift.swift
//  DemoSwiftKotlin-Swift
//
//  Created by Flavio Franco on 6/28/17.
//  Copyright © 2017 VLEIX. All rights reserved.
//

import UIKit

class UtilSwift: NSObject {

    func subtract(_ number1: Double,_ number2: Double) -> Double {
        let result = number1 - number2
        return result
    }
    
    func add(_ number1: Double,_ number2: Double) -> Double {
        let result = number1 + number2
        return result
    }
    
    func multiply(_ number1: Double,_ number2: Double) -> Double {
        let result = number1 * number2
        return result
    }
    
    func divide(_ number1: Double,_ number2: Double) -> Double {
        let result = number1 / number2
        return result
    }
    
    func stringToDouble(_ string: String) -> Double {
        return Double(string)!
    }
    
    func doubleToString(_ double: Double) -> String {
        return String(double)
    }
    
    func historical(_ results: Array<Result>) -> String {
        var historical : String = ""
        
        let count = results.count
        for i in 0..<count {
            historical = "\(historical)\n\(results[i].numberResult) \(results[i].date)"
        }
        
        return historical
    }
    
}
