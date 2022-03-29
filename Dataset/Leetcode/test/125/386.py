 class Solution:
    def XXX(self, s: str) -> bool:
        import re
        ret = re.findall("[a-z0-9].*?",s.lower())
        return ret == ret[::-1]

