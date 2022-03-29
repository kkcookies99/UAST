 class Solution:
    def XXX(self, s: str) -> bool:
        s = str.lower(s)
        s = list(re.findall("[a-z\d]",s))
        return s == s[::-1]

