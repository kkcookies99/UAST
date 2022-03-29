 class Solution:
    '''第九题'''

    def XXX(self, s: str) -> bool:
        s = ''.join([i.lower() for i in s if i.strip().isalnum()])
        return s == s[::-1]

