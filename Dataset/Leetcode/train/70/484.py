class Solution:
    def XXX(self, n: int) -> int:
        methods=0
        temp1=1
        temp2=1
        if n==1:
            return temp2
        for i in range(2,n+1):
            methods=temp1+temp2
            temp1=temp2
            temp2=methods
        return methods

