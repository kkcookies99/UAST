 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int

        """
        
        a = s.strip().split(' ')
        if len(a):
            return len(a[-1])
        else:
            return 0

