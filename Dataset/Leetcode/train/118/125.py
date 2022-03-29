 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        s = []
        temp = [1,1]
        for i in range(numRows):
            mi = [1]
            if i==0:
                mi = [1]
            elif i==1:
                mi.append(1)
            else:
                for j in range(1,i):
                    mi.append(temp[j-1]+temp[j])
                mi.append(1)    
            temp = mi
            s.append(mi)
        return s

