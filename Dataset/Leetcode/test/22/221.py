 class Solution:
    def __init__(self):
        self.result = []
    
    def XXX(self, n: int) -> List[str]:
        self.reverse(0,0,"",n)
        return self.result
            
    def reverse(self, left, right, tmp, n):
        if left<right  or left>n or right>n:
            return
        if len(tmp)==n*2:
            self.result.append(tmp)
            return
        self.reverse(left+1,right,tmp+"(",n)
        self.reverse(left, right+1,tmp+")",n)

