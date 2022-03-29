 class Solution(object):
    def XXX(self, s, numRows):
        if numRows <= 1:
            return s
        sizehalfz = 2 * numRows - 2
        dp = [""] * numRows
        for i in range(len(s)):
            if (i % sizehalfz) < numRows:
                dp[i % sizehalfz] += s[i]
            else:
                dp[numRows - 2 - ((i % sizehalfz) % numRows)] += s[i]
        res = ""
        for s in dp:
            res += s
        return res

