 class Solution:
    def XXX(self, t, p):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if not p : return 0
        _next = [0] * len(p)

        def getNext(p, _next):
            _next[0] = -1
            i = 0
            j = -1
            while i < len(p) - 1:
                if j == -1 or p[i] == p[j]:
                    i += 1
                    j += 1
                    _next[i] = j
                else:
                    j = _next[j]
        getNext(p, _next)
        i = 0
        j = 0
        while i < len(t) and j < len(p):
            if j == -1 or t[i] == p[j]:
                i += 1
                j += 1
            else:
                j = _next[j]
        if j == len(p):
            return i - j
        return -1

