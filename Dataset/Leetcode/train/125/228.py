 class Solution:
    def XXX(self, s: str) -> bool:
        import re
        res = ''.join(re.findall(r'[A-Za-z0-9]', s))
        if res.casefold() == res.casefold()[::-1]:
            return True
        else:
            return False

