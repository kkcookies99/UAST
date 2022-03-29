class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        r = len(digits) - 1
        while r >= 0:
            if digits[r] < 9:
                digits[r] += 1
                return digits
            else:
                digits[r] = 0
                r -= 1
        if r < 0:
            digits.insert(0, 1)
        return digits

