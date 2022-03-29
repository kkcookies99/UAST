class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        n=len(digits)
        sum=0
        for i in range(n):
            sum=10*sum+digits[i]
        sum+=1
        result=[]
        for i in str(sum):
            result.append(int(i))
        return result

