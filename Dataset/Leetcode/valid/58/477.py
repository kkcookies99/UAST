class Solution:
    def XXX(self, s: str) -> int:
        A=s.split(' ')
        while A[-1]=="":
            A.pop()
        return len(A[-1])

