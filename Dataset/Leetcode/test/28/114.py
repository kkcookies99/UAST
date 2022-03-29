 class Solution(object):
    def XXX(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if len(needle)==0:
            return 0
        if haystack.__contains__(needle):
            return haystack.index(needle)
        return -1

