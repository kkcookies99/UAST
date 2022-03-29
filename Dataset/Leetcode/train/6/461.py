 class Solution(object):
    def XXX(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        """
        numRows = 4的情况下 "PAYPALISHIRING" 转换
            行   P A Y P A L I S H I R I N G
            0    0           0           0
            1      1       1   1       1   1
            2        2   2       2   2
            3          3           3
        """
        #行数1直接返回本身
        if numRows == 1:
            return s
        result = ''
        record = [['']*len(s) for i in range(numRows)]
        for i in range(len(s)):
            #二维数组记录Z转换后的信息
            if i%(numRows-1) == 0:
                if (i/(numRows-1))%2 == 1:
                    h = numRows-1
                else:
                    h = 0
            else:
                if (i/(numRows-1))%2 == 1:
                    h = numRows-1 - i%(numRows-1)
                else:
                    h = i%(numRows-1)
            record[h][i] = s[i]
        #组合答案
        for x in record:
            for y in x:
                if y != '':
                    result += y
        return result

