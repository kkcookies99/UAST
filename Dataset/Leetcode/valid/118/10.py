 def XXX(self, numRows: int) -> List[List[int]]:
        matrix=[]
        if numRows==1:
            return [[1]]
        elif numRows==2:
            return [[1],[1,1]]
        else:
            matrix.append([1])
            matrix.append([1,1])
            for i in range(2,numRows):
                matrix.append([0 for x in range(i+1)])
                matrix[i][0]=1
                matrix[i][i]=1
                for j in range(1,math.ceil((i+1)/2)):
                    matrix[i][j]=matrix[i-1][j-1]+matrix[i-1][j]
                    matrix[i][i-j]=matrix[i][j]
            return matrix

