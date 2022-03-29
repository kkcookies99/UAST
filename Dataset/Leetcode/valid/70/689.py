class Solution:
    def __init__(self) -> None:
        self.memo ={}
    def XXX(self, n: int) -> int:
        if n==1 or n==0:
            return 1
        if n==2:
            return 2
        if n in self.memo:
            return self.memo[n]
        answer = self.XXX(n-1)
        answer2 = self.XXX(n-2)
        if n-1 not in self.memo:
            self.memo[n-1] = answer
        if n-2 not in self.memo:
            self.memo[n-2] = answer2 
        return answer+answer2

