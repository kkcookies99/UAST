 class Solution:
    def XXX(self, x: int) -> int:
        isMinus = 0
        if x < 0:
            isMinus = 1
            x = -x
        resultList = []
        i = 0
        while x >= 1:
            resultNum = x % 10
            resultList.append(resultNum)
            x = (x - resultNum) / 10
        minLen = -len(resultList)
        for i in range(-1, minLen-1, -1):
            x = x + resultList[i] * pow(10, -i-1)
        result = int(x)
        if isMinus == 1:
            result = -result
        if -2**31 < x <2**31-1:
            return result
        return 0





