 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: bool
        """
        a=[i for i in s if i.isalpha() or i.isnumeric()]
        res="".join(a).lower()
        return res[::-1]==res

