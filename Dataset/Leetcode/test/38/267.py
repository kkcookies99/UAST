class Solution:
    def XXX(self, n: int) -> str:
        def help(s):
            l = len(s)
            i = 0
            res = ""
            while i < l:
                j = i
                cnt = 0
                while j < l and s[j] == s[i]: 
                    cnt+=1
                    j += 1
                res += str(cnt) + s[i]
                i = j
            return res
        s = "1"
        for i in range(n-1):
            s = help(s)
        return s

