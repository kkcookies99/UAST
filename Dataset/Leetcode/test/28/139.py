 class Solution(object):
    def XXX(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if needle == '':
            return 0
        elif needle not in haystack:
            return -1
        else:
            return haystack.index(needle)

