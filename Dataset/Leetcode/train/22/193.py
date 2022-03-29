 class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        if n==0:
            return []
        if n==1:
            return ["()"]
        if n==2:
            return ["()()","(())"]
        result = []
        A =[["()"],["()()","(())"]]
        i=2
        
        
        while i <n:
            result = []
            for j in range(len(A[i-1])):
                result += ["(" + A[i-1][j]+")"]            
                result += ["()" + A[i-1][j] ]
            for j in range(len(A[i-2])):
                result +=  ["(" + A[i-2][j] + ")" +"()"]
            for j in range(i-2):
                for k in range(len(A[j])):
                    for h in range(len(A[i-j-3])):                    
                        result += ["(" + A[j][k] + ")"+  A[i-j-2][h]]
            
            
            A.append(result)                              
            i += 1
            
            
        return A[n-1]

