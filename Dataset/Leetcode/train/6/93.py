 class Solution(object):
    def XXX(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows == 1:
            return s
        ans = ""
        for i in range(numRows):
            n = 0
            z =1
            while i + n * (numRows - 1) * 2 < len(s):
                ans += s[i + n * (numRows - 1) * 2]
                if i != 0 and i != numRows-1 and z * (numRows - 1) * 2 - i < len(s):
                    ans += s[z * (numRows - 1) * 2 - i]
                n += 1
                z += 1
        return ans

