 class Solution:
    def XXX(self, s: str) -> bool:
        while True:
            for quote in ('()', '[]', '{}'):
                if quote in s:
                    s = s.replace(quote, '')
                    break
            else:
                return len(s) == 0

