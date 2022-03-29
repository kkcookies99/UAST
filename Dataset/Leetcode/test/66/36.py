 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        carry = 1
        for i in range(len(digits)-1, -1, -1):
            re = (digits[i] + carry) % 10
            carry = (digits[i] + carry) // 10
            digits[i] = re
            if not carry: return digits
        return [1]+digits

