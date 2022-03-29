class Solution:
    def XXX(self, L: List[List[int]]) -> List[List[int]]:
        L.sort()
        i = 0
        while i < len(L)-1:
            if L[i][1] >= L[i+1][0]:
                L[i][1] = max(L[i][1],L[i+1][1])
                L.pop(i+1)
            else:
                i += 1
        return L


