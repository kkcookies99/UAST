 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        if len(digits) == 1 and digits[0] == 9:
            digits.insert(0, 0)
        if digits[-1] != 9:
            digits[-1] += 1
        else:
            digits[-1] = 0
            digits[:-1] = self.XXX(digits[:-1])

        return digits

