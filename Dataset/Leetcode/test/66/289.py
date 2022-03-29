 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        i = len(digits) - 1
        while i >= 0 and digits[i] == 9:
            digits[i] = 0
            i -= 1
        if i == -1:
            digits.insert(0, 1)
        else:
            digits[i] += 1
        return digits

