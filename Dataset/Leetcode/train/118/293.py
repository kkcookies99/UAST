 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        a=[[1]]
        for x in range(2,numRows+1):
            a.append([])
            for c in range(1,x+1):
                if c==1:
                    a[x-1].append(1)
                elif c==x:
                    a[x-1].append(1)
                else:
                    a[x-1].append(a[x-2][c-1]+a[x-2][c-2])
        return a

