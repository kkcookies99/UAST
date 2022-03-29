 class Solution:
    def tranform(self,matrix):
        m = len(matrix)
        n = len(matrix[0])
        res = [[0]*m for _ in range(n)]
        for i in range(m):
            for j in range(n):
                res[j][i] = matrix[i][j]
        return res
            
    def XXX(self, s: str, numRows: int) -> str:
        if s == "":
            return ""
        if numRows == 1:
            return s
        ans = []
        i = 1
        while s!='':
            if (i-1)%(numRows-1) != 0:
                index = numRows-1-((i-1)%(numRows-1))
                l1 = [' ']*numRows
                #print(index,i)
                l1[index] = s[0]
                ans.append( l1 ) 
                s = s[1:]
            else:
                tmp = s[:numRows]
                n = len(tmp)
                for _ in range(numRows - n):
                    tmp += ' '
                ans.append( list( tmp ) )
                s = s[numRows:]
            i+=1
        
        #print(ans)
        res = self.tranform(ans)
        #print(res)
        ret = ''
        for i in range(len(res)):
            for j in range(len(res[0])):
                if res[i][j]!=' ':
                    ret += res[i][j]
        return ret

