 class Solution {
    func XXX(_ str: String) -> Int {
        //除去前后空格
        var str = str.trimmingCharacters(in: .whitespaces)
        if str.isEmpty {return 0}
        var sign:Int = 1,base:Int = 0,i:Int = 0,n:Int = str.count
        while(i < n && str.charAt(i) == " ")
        {
            i += 1
        }
        if str.charAt(i) == "+" || str.charAt(i) == "-"
        {
            sign = (str.charAt(i++) == "+") ? 1 : -1
        }
        //ASCII: '0'为48   '9'为57
        while(i < n && str.toInt(i) >= 48 && str.toInt(i) <= 57)
        {
            if base > Int32.max / 10 || (base == Int32.max / 10 && str.toInt(i) - 48 > 7)
            {
                return (sign == 1) ? Int(Int32.max) : Int(Int32.min)
            }
            base = 10 * base + (str.toInt(i++) - 48)
        }
        return base * sign
    }
}

extension String {
    //获取指定索引位置的字符，返回为字符串形式
    func charAt(_ num:Int) -> String
    {
        guard num < self.count else {
            assertionFailure("Index out of range!")
            return String()
        }
        let index = self.index(self.startIndex,offsetBy: num)
        return String(self[index])
    }
    
    //获取指定索引位置字符的ASCII整数值
    func toInt(_ num:Int) -> Int
    {
        guard num < self.count else {
            assertionFailure("Index out of range!")
            return 0
        }
        var number:Int = Int()  
        for scalar in charAt(num).unicodeScalars  
        {  
            number = Int(scalar.value)  
        }  
        return number  
    }
}

/*扩展Int类，实现自增++*/
extension Int{
    //后缀++:先执行表达式后再自增
    static postfix func ++(num:inout Int) -> Int {
        //输入输出参数num
        let temp = num
        //num加1
        num += 1
        //返回加1前的数值
        return temp
    }
}

