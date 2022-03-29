class Solution:
    def XXX(self, s: str) -> int:
        table = {'I':1, 'V':5, 'X': 10, 'L': 50, 'C': 100, 'D':500, 'M':1000}
        
        integer = 0
        
        for i in range(len(s)-1): #不包括最后一位，防止后面i+1out of index
            if table[s[i]] >= table[s[i+1]]: #左>=右时相加
                integer += table[s[i]]
                
            else:
                integer -= table[s[i]] #左<右则相减
                
        return integer + table[s[-1]] #最后一位补在这里

