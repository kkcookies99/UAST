 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        for j in range(len(digits)-1, -1, -1):
            if digits[j] == 9:
                digits[j] = 0
            else:
                digits[j] += 1
                return digits
        return [1] + digits

