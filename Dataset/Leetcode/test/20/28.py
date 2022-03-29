 class Solution:
    def XXX(self, s: str) -> bool:
        d = {")": "(", "]":"[", "}": "{"}
        l = []
        for i in s:
            if d.get(i) is None:
                l.append(i)
            elif len(l) == 0 or d.get(i) != l[-1]:
                return False
            elif d.get(i) == l[-1]:
                l.pop()
        if len(l) == 0:
            return True
        else:
            return False


