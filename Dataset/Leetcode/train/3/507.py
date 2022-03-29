 class Solution:
    def _do(self, ran, pos):
        if pos >= self._strLen:
            return 0
        ch = self._s[pos]
        subStr = self._s[ran[0]: ran[1]]
        if ch in subStr:
            subPos = subStr.find(ch)
            return max(ran[1] - ran[0], self._do((subPos + ran[0] + 1, ran[1] + 1), pos + 1))
        return max(ran[1] - ran[0] + 1, self._do((ran[0], ran[1] + 1), pos + 1))

    def XXX(self, s: str) -> int:
        if len(s) <= 1:
            return len(s)
        self._s = s
        self._strLen = len(s)        
        return self._do((0, 1), 1)

