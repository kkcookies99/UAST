class Solution:
    def XXX(self, n: int) -> int:
        if(n == 1):
            return(1)
        elif(n == 2):
            return(2)
        else:
            i,n1,n2 = 3, 1, 2
            while(i < n):
                if(i%2 != 0):
                    n1 = n1 + n2
                else:
                    n2 = n1 + n2
                i += 1
            return(n1 + n2)

