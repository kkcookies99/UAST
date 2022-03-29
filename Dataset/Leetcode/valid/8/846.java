 class Solution {
    func XXX(_ str: String) -> Int {
      if str.isEmpty {
            return 0
        } else {
            var numArr:[UInt32] = []//存放数字
            var start = false//开头是否符合格式要求
            var positive = true//正数还是负数
            
            for index  in str.indices {
                let item = str[index]
                if numArr.isEmpty && start == false{//还没开始识别
                    if item == " "  {//跳过开头的空格
                        continue
                    } else if item == "+" || item == "-" {//添加符号
                        start = true
                        if item == "-" {
                            positive = false
                        }
                    } else if (item >= "0" && item <= "9") {//添加数字
                        let num = item.unicodeScalars.first!.value - "0".unicodeScalars.first!.value
                        
                        numArr.append(num)
                        start = true
                    } else {//其他开头不符合
                        return 0
                    }
                } else if (item >= "0" && item <= "9") {//开始后只能加数字
                    let num = item.unicodeScalars.first!.value - "0".unicodeScalars.first!.value
                    
                    numArr.append(num)
                } else {//其他结束
                    break
                }
            }
            
            if numArr.isEmpty {
                return 0
            } else {
                var result:Int = 0
                let max10 = Int32.max / 10
                let min10 = Int32.min / 10
                
                for i in 0..<numArr.count {
                    let item = numArr[i]
                    if positive {
                        if result > max10 {//将溢出
                            return Int(Int32.max)
                        }else {
                            result *= 10
                        }
                        if Int32.max - Int32(item) < result {//将溢出
                            return Int(Int32.max)
                        }else {
                            result += Int(item)
                        }
                        
                    } else {//负数
                        
                        if result < min10 {//将溢出
                            return Int(Int32.min)
                        }else {
                            result *= 10
                        }
                        if Int32.min + Int32(item) > result {//将溢出
                            return Int(Int32.min)
                        }else {
                            result -= Int(item)
                        }
                        
                    
                    }
                    
                }
                return result
            }
        }
    }
}

