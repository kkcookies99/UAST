 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        t, m = '', 0
        for i in s:
            if i in t:
                m, t = max(m, len(t)), t[t.index(i)+1:]
            t += i
        return max(m, len(t))

