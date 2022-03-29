 class Solution:
    def XXX(self, s: str) -> str:
        res = ''#要输出的最长回文字串
        if len(s) == 1:
            return s
        for i in range(len(s)):
            temp = ''#临时的回文子串
            temp1 = ''#临时的回文子串
            temp2 = ''#临时的回文子串
            if 0<=i<len(s)-1 and s[i] == s[i+1]:#判断回文子串为偶数
                k = 1#要往前后移动的位数
                while 0<=i-k and i+1+k<len(s) and s[i-k] == s[i+1+k]:
                    k += 1
                k = k-1
                temp1 = s[i-k:i+2+k]
            if 0<=i<=len(s)-1:#判断回文子串为奇数
                k = 1#要往前后移动的位数
                while 0<=i-k and i+k<len(s) and s[i-k] == s[i+k]:
                    k += 1
                k = k-1
                temp2 = s[i-k:i+1+k]
            temp = temp1 if len(temp1) >= len(temp2) else temp2
            res = max(res,temp,key=len)
        return res

