 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        s = s.split(' ')
        for i in range(s.count('')):
            s.remove('')
        if len(s) == 0:
            return 0
        else:
            return len(s[-1])

