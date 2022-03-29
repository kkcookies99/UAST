class Solution:
    def XXX(self, a: str, b: str) -> str:
        return bin(self.bin2dex(a)+self.bin2dex(b))[2:]

    def bin2dex(self,a):
        aInt=0
        i=1
        while i<=len(a):
            aInt+= (0 if a[-i]=='0' else 1)*(2**(i-1))
            #print(aInt,i,a)
            i+=1
        return aInt

