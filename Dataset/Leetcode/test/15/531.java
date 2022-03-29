 class Solution {
    func XXX(_ nums: [Int]) -> [[Int]] {
        if nums.count < 3 {
            return []
        }
        // 长度大于等于3的
        var numbers = nums.sorted()
        var res: Array<Array<Int>> = []
        for i in 0..<numbers.count - 1 {
            let iValue = numbers[i]
            if iValue > 0 {
                return res
            }
            if i > 0 && numbers[i-1] == iValue {
                continue
            }
            var leftIndex = i + 1
            var rightIndex = numbers.count - 1 
            while leftIndex < rightIndex {
                let sum = iValue + numbers[leftIndex] + numbers[rightIndex]
                if sum == 0 {
                    res.append([iValue, numbers[leftIndex], numbers[rightIndex]])
                    while leftIndex < rightIndex && numbers[leftIndex] == numbers[leftIndex + 1] {
                        leftIndex = leftIndex + 1
                    }
                    while leftIndex < rightIndex && numbers[rightIndex] == numbers[rightIndex - 1] {
                        rightIndex = rightIndex - 1
                    }
                    leftIndex = leftIndex + 1
                    rightIndex = rightIndex - 1
                } else if sum > 0 {
                    rightIndex = rightIndex - 1
                } else {
                    leftIndex = leftIndex + 1
                }
            }
        }
        return res
    }
}

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


