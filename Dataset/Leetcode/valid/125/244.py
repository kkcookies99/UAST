 class Solution:
    def XXX(self, s: str) -> bool:
        return ''.join(filter(str.isalnum, s)).lower() == ''.join(filter(str.isalnum, s))[::-1].lower()

