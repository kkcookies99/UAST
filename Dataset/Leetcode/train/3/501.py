 class Solution:
    def XXX(self, s: str) -> int:
        if len(s) == 0:
            return 0

        result = {}
        left = 0
        max_length = 0

        for i, c in enumerate(s):
            if c in result and result[c] >= left:
                left = result[c] + 1
            else:
                max_length = max(i - left + 1, max_length)
            result[c] = i

        return max_length

