 class Solution:
    def XXX(self, s: str) -> bool:
        s = re.sub('[^a-z0-9]','',s.lower())
        return s == s[::-1]

