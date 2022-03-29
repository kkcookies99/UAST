 class Solution:
    def preSolute(self,s):
        newS = '?'
        for i in range(len(s)):
            newS += '#' + s[i]
        newS += '#='
        return newS
    def findPalindrome(self,s, i, p, k, maxLen):
        while s[i - p[i] - 1] == s[i + p[i] + 1]:
            p[i] += 1
        C = i
        R = i + p[i]
        if maxLen < p[i]:
            maxLen = p[i]
            k = i
        return C, R, k, maxLen
    def XXX(self, s):
        """
        :type s: str
        :rtype: str
        """
        import math
        newS = self.preSolute(s)
        p = [0]
        C = R = 0
        maxLen = 0
        k = 0
        for i in range(1, len(newS) - 1):
            if i <= R:
                j = C - (i - C)
                if p[j] < R - i:
                    p.append(p[j])
                else:
                    p.append(R - i - 1)
                    C, R, k, maxLen = self.findPalindrome(newS, i, p, k, maxLen)
            else:
                p.append(0)
                C, R, k, maxLen = self.findPalindrome(newS, i, p, k, maxLen)
        realMaxLen = int(maxLen / 2)
        real_i = k / 2 - 1

        return s[int(math.ceil(real_i - realMaxLen)) : int(real_i + realMaxLen + 1)]

