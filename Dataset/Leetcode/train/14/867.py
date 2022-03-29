 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if len(strs) == 1:
            return strs[0]
        else:
            temp = 0
            res = ""
            lens = float("inf")
            for j in strs:
                if len(j) < lens:
                    lens = len(j)
            while temp < lens:
                for i in range(1,len(strs)):
                    if strs[i][temp] != strs[0][temp]:
                        return res
                res = strs[0][:temp+1]
                temp += 1
            return res

