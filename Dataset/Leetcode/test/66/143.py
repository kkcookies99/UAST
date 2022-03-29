 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        bit = 1
        for i in range(len(digits) - 1, -1, -1):
            digits[i] += bit
            if digits[i] >= 10:
                digits[i] %= 10
                bit = 1
            else:
                bit = 0
        if bit:
            digits.insert(0, bit)
        return digits

