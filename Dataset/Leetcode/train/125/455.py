 class Solution:
    def XXX(self, s: str) -> bool:
        l = ''.join(split('[^a-z0-9]',s.lower()))
        return l == l[::-1]

