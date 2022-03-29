 class Solution(object):
    def XXX(self, num):
        specDict = {4: 'IV', 9: 'IX', 40: 'XL', 90: 'XC', 400: 'CD', 900: 'CM'}
        # 1000:
        val1 = num // 1000
        num %= 1000
        result = "M"*val1
        # 100
        val2 = num // 100
        if val2*100 in specDict.keys():
            result += specDict[val2*100]
            num %= val2*100
        else:
            # 500
            val3 = num // 500
            result += 'D'*val3
            num %= 500
            # 100
            val4 = num // 100
            result += 'C'*val4
            num %= 100
        # 10
        val5 = num // 10
        if val5 * 10 in specDict.keys():
            result += specDict[val5*10]
            num %= val5*10
        else:
            # 50
            val6 = num // 50
            result += 'L'*val6
            num %= 50
            # 10
            val7 = num // 10
            result += 'X'*val7
            num %= 10
        # 1
        if num in specDict.keys():
            result += specDict[num]
        else:
            # 5
            val8 = num // 5
            result += 'V'*val8
            num %= 5
            # 1
            result += 'I'*num
        return result

    def XXX2(self, num):
        values = [1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1]
        strings = ["M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"]
        result = ""
        for index in range(13):
            while num >= values[index]:
                num -= values[index]
                result += strings[index]
        return result

