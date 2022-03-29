 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        l=[1]
        res=[]
        for i in range(numRows):
            res.append(l)
            l=[sum(n) for n in zip([0]+l,l+[0])]
        return res

