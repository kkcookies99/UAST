class Solution:
    def XXX(self, s: str) -> int:
        right = len(s) - 1
        l = list(s)
        result = []
        while right >= 0:
            if l[right] == ' ':
                right -= 1
                if len(result) != 0: return len(result)
            else:
                result.append(l[right])
                right -= 1
        return len(result)

