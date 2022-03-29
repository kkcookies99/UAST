 class Solution:
    '''第一题'''

    def XXX(self, numRows: int) -> List[List[int]]:
        if numRows==0:return []
        l = [[1]]
        for i in range(numRows-1):
            line = [1]
            for j in range(len(l[i])):
                line.append(sum(l[i][j:j + 2]))
            l.append(line)
        return l

