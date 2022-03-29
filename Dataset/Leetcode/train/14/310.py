 class Solution:
    def XXX(self, strs: List[str]) -> str:
        strs = sorted(strs, key=lambda strs: len(strs), reverse=False)
        s = ""
        for i in range(len(strs[0])):
            flag = 0
            for j in range(1, len(strs)):
                if strs[0][i] == strs[j][i]:
                    flag = 1
                else:
                    flag = 0
            if flag == 1:
                s += strs[0][i]
            else:
                break

        return s

