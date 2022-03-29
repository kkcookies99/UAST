 class Solution:
    def XXX(self, numRows: int) -> List[List[int]]:
        if numRows<=0:
            return []
        if numRows==1:
            return [[1,],]
        if numRows==2:
            return [[1,],[1,1]]
        lists=[[1,],[1,1]]
        for i in range(2,numRows):
            for j in range(i+1):
                if j==0:
                    lists.append([1,])
                elif j==i:
                    lists[i].append(1)
                else:
                    lists[i].append(lists[i-1][j-1]+lists[i-1][j])
        return lists


