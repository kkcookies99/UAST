 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        if '()' in s or '[]' in s or '{}' in s:
            bol = True
        else:
            bol = False
        return bol

