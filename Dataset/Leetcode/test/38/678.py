 class Solution:
    def XXX(self, n: int) -> str:
        
        strs = "1"
        if n == 1:
            return strs
        i = 0
        for j in range(1,n):
            cnt = 0
            ret = ""
            for i in range(len(strs) - 1):
                cnt += 1
                if strs[i] != strs[i + 1]:
                    ret = ret + str(cnt) + strs[i]
                    cnt = 0
            if len(strs) > 1:
                if  strs[i] != strs[i + 1]:
                    ret = ret + "1" + strs[i + 1]
                else:
                    ret = ret + str(cnt + 1) + strs[i + 1]
            else:
                ret = ret + "1" + strs[i]
            strs = ret
        return strs

