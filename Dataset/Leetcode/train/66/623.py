class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        index = len(digits)-1
        while index>=0:
            if digits[index]!=9:
                digits[index]=int(digits[index])+1
                return digits
            else:
                digits[index]=0
                index-=1
        digits.insert(0, 1)
        return digits

