 class Solution(object):
    def XXX(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        z = 0
        f = True
        if numRows == 1: return s
        tmp = [[] for i in range(numRows)]
        for i in s:
            tmp[z].append(i)
            if z == (numRows-1) or z == 0: f = not f
            z = z-1 if f else z+1
        r = ""
        for t in tmp:
            r += "".join(t)
        return r

