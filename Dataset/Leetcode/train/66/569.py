class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        if digits[-1] != 9:
            digits[-1] += 1
            return digits
        update = 1
        if digits[0] == 9:
            digits.insert(0, 0)
        
        update = 1
        length = len(digits)
        i = length - 1
        while i >= 0:
            if digits[i] == 9 and update == 1:
                digits[i] = 0
            elif digits != 9 and update == 1:
                digits[i] += 1
                update = 0
            i -= 1
        
        if digits[0] == 0:
            digits.pop(0)
        return digits

