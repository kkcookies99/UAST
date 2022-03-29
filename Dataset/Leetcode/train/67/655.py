class Solution:
    def XXX(self, a: str, b: str) -> str:
        list_a, list_b = list(a), list(b)
        digits, carry = [], 0
        while list_a or list_b or carry:
            digit = carry
            if list_a:
                digit += int(list_a.pop())
            if list_b:
                digit += int(list_b.pop())
            digit, carry = digit & 1, digit >> 1
            digits.append(str(digit))

        return ''.join(reversed(digits))


