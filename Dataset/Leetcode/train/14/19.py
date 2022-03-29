 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if len(strs) == 1: return strs[-1]
        res = ""
        for i in range(len(strs[0])):
            temp = 0
            for j in strs[1:]:
                if strs[0][:i+1] == j[:i+1]:
                    temp += 1
            if temp == len(strs) - 1:
                res = strs[0][:i+1]
        return "".join(res) if res else ""

