 class Solution:
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        cnt, tail = 0, len(s) - 1
        while tail >= 0 and s[tail] == ' ':
            tail -= 1
        while tail >= 0 and s[tail] != ' ':
            cnt += 1
            tail -= 1
        return cnt

