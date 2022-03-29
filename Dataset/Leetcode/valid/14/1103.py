 class Solution:
    def XXX(self, strs: List[str]) -> str:
        if not strs:
            return ""

        n = min(len(s) for s in strs)
        res = -1
        for i in range(n):
            if self.check_same(i, strs):
                res = i
                continue
            else:
                break
        return strs[0][:res+1] if res >= 0 else ""

    def check_same(self, idx: int , strs: List[str]):
        c = strs[0][idx]
        for s in strs[1:]:
            if s[idx] == c:
                continue
            else:
                return False
        return True

