 class Solution:
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        if len(s)==0:
            return 0
        return len(s.strip().split(" ")[-1])

