 class Solution(object):
    def XXX(self, s, numRows):
        if numRows==1:
            return s
        res = ['' for _ in range(numRows)]
        # 周期
        T = numRows + numRows -2
        for i in range(len(s)):
            t_num = i%T
            temp = t_num if t_num<numRows else numRows-(t_num)%numRows-2
            res[temp] += s[i] 
        return ''.join(res)

