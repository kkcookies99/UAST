 class Solution:
    def XXX(self, s: str) -> bool:
        s = ''.join(filter(str.isalnum, s)).lower()
        # Only half need to be compared
        temp = len(s)//2
        return s[:temp]==s[-1:-1-temp:-1]

