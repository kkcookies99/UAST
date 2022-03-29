class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        carry = 1
        for i in range(len(digits)-1, -1, -1):
            digits[i] += carry
            carry = digits[i] // 10
            digits[i] %= 10
        if carry == 1:return [1, *digits]
        else:return digits

