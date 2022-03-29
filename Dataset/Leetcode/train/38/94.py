class Solution:
    def XXX(self, n):
        """
        :type n: int
        :rtype: str
        """
        import re
        s = '1'
        for _ in range(n - 1):
            s = ''.join(str(len(p[0])) + p[1] for p in re.findall(r'((.)\2*)', s))
        return s

