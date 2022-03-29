 class Solution:
    def XXX(self, s: str) -> bool:
        if not s:
            return True

        s = s.lower()
        res = []

        for _s in s:
            if 'a' <= _s <= 'z' or '0' <= _s <= '9':
                res.append(_s)
        
        return res == res[::-1]

