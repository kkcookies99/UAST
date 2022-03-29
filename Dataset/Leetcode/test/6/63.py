 class Solution(object):
    def XXX(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows == 1:
            return s
        else:
            a = ['' for j in range(numRows)]
            T = 2 * numRows - 2
            for i in range(len(s)):
                h = i % T
                if h < numRows:
                    a[h] = a[h] + s[i]
                else:
                    a[T - h] = a[T - h] + s[i]
            return ''.join(a)

