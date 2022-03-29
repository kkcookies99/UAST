 class Solution(object):
    def XXX(self, s):
        if len(s.replace(' ','')) == 0:
            return 0
        s = s.strip().split(' ')
        return len(s[-1])

