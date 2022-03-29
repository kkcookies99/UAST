 class Solution:
    def XXX(self, a: str, b: str) -> str:
        la, lb = len(a), len(b)
        l = max(la, lb)
        a = (l - la) * "0" + a
        b = (l - lb) * "0" + b
        result = []
        extra = 0
        for i in range(l - 1, -1, -1):
            sum = int(a[i]) + int(b[i]) + extra
            extra = sum // 2
            result.append(str(sum % 2))
        if extra:
            result.append(str(extra))
        result.reverse()
        return "".join(result)

