 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        num=0
        result=[]
        length=len(digits)
        for i in range(length):
            num+=digits[length-1-i]*(10**i)
        num+=1
        for i in str(num):
            result.append(int(i))
        return result

