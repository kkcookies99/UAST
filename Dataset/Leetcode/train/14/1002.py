 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if len(strs)==1:
            return strs[0]
        temp = ''
        for i in range(len(strs)-1):
            if not strs[i]:
                break
            n1 = len(strs[i])
            n2 = len(strs[i+1])
            n = n1 if n1<n2 else n2
            temp = ''
            for j in range(n):
                if strs[i][j]==strs[i+1][j]:
                    temp = temp + strs[i][j]
                else:
                    break

            strs[i+1] = temp
        return temp

