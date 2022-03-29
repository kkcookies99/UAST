 class Solution:
    def XXX(self, s: str) -> bool:
        if not s:
            return True
        s = s.lower()
        s = re.findall("\w", s)
        return s == s[::-1]

