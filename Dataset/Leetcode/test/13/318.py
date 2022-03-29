class Solution:
    def XXX(self, s: str) -> int:
        m = {'I': 1, 'V': 5, 'X': 10, 'L': 50, 'C': 100, 'D': 500, 'M': 1000}
        res, left, right = 0, 0, 0
        for i in s:
            left, right = right, m[i]
            res = res - left if left < right else res + left
        return res + right

