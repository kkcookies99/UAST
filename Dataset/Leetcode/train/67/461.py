class Solution:
    def XXX(self, a: str, b: str) -> str:
        temp1 = int(a,2)
        temp2 = int(b,2)
        temp3 = bin(temp1+temp2)
        return temp3[2:]

