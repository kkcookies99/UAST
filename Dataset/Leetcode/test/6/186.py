 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if (len(s) <= numRows): return s
        if (numRows == 1): return s
        result = []
        for i in range(numRows):
            jump = [2*(numRows - i - 1), 2*i]#索引的差
            k = i#当前索引
            result.append(s[k])
            k += jump[0]
            j = 1#0或1交替指向jump的某一个
            while(k<len(s)):
                if (jump[(j+1)%2]!=0):
                    result.append(s[k])
                k += jump[j]
                j = (j+1)%2
        return "".join(result)

        ```
