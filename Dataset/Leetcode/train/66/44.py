 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        num = 0
        ss = []
        for i in range(len(digits)):
            num += digits[i]*(pow(10,len(digits)-i-1))
        for i in str(num+1):
            ss.append(int(i)) 
        return ss

