 class Solution(object):
    def XXX(self, s):
        length = 0
        for i in range(0, len(s)):
            for j in range(i + 1, len(s) + 1):
                if j == len(s) or s[j] in s[i:j]:
                    length = max(j - i, length)
                    break
        return length

