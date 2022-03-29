 class Solution(object):
    def XXX(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if haystack == needle:
            return 0
        
        if len(needle) == 0:
            return 0

        haystack_length = len(haystack)
        needle_length = len(needle)

        for i in range(haystack_length):
            # If the current char equals to 
            # needle[0]
            if haystack[i] == needle[0]:
                if haystack[i:i+needle_length] == needle:
                    return i
        
        return -1

