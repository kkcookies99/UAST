 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        left, right = 0, len(s) - 1
        s = s.lower()
        word = 'abcdefghijklmnopqrstuvwxyz1234567890'
        while left < right:
            if s[left] not in word:
                left += 1
                continue
            if s[right] not in word:
                right -= 1
                continue
            if s[left] != s[right]:
                return False
            left += 1
            right -= 1
        return True


