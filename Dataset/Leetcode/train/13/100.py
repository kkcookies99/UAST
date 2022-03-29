class Solution:
    """
    first time:23min
    total time:39min
    time complexity:O(n)
    total complexity:O(n)
    idea:
    """
    def XXX(self, s: str) -> int:
        rNumber={
            'I':1,
            'V':5,
            'X':10,
            'L':50,
            'C':100,
            'D':500,
            'M':1000
        }
        rSum=0
        for j in range(len(s)-1):
            rSum+=rNumber.get(s[j],0)
            group=s[j]+s[j+1]
            if  group=='IV' or group=='IX':
                rSum-=2
            elif group=='XL' or group=='XC':
                rSum-=20
            elif group=='CD' or group=='CM':
                rSum-=200
        rSum+=rNumber.get(s[-1],0)
        return rSum
        

