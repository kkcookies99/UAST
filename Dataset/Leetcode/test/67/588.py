class Solution:
    def XXX(self, a: str, b: str) -> str:
        #return bin(int(a,2)+int(b,2))[2:]
        return '{:b}'.format(int(a,2)+int(b,2))

