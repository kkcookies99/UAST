 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        digits = [0] + digits
        num = 1
        for i in range(len(digits)-1, -1 ,-1):
            if not num:
                break
            num ,digits[i]= divmod((digits[i]+num),10)
        
        return digits if digits[0] else digits[1:]

