 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        n = len(digits)
        jinwei = 0
        digits[-1] += 1
        for i in range(n-1,-1,-1):
            digits[i] += jinwei
            jinwei = 0
            if digits[i] == 10:
                digits[i] = 0
                jinwei = 1
        if jinwei == 1:
            return [1] + digits
        else:
            return digits

