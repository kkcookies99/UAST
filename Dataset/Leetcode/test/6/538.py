 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        res = [[] for _ in range(numRows)]
        for i, c in enumerate(s):
            cur = i % (2 * numRows - 2)
            res[cur if cur < numRows else 2 * numRows - cur - 2].append(c)
        return "".join("".join(item) for item in res)

