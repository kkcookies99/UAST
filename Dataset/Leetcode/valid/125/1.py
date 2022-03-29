 class Solution:
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        s = ''.join(filter(str.isalnum,s)).lower()
        return s==s[::-1]

