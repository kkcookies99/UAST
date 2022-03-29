 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        char = {m:0 for m in list("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789")}
        left, right = 0, len(s)-1
        while left <= right:
            if s[left] not in char:
                left += 1
                continue
            if s[right] not in char:
                right -= 1
                continue
            if s[right].lower() != s[left].lower():
                return False
            left += 1
            right -= 1
        return True

