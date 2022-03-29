 class Solution:
    def XXX(self, s: str) -> bool:
        t = re.compile('([0-9a-z])')
        s = ''.join(t.findall(s.lower()))
        return s == s[::-1]

