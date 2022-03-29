 class Solution(object):
    def XXX(self, haystack, needle):
        if needle == None:
            return 
        if needle == '':
            return 0
        n = len(needle)
        m = len(haystack)
        if haystack == needle:
            return 0
        for i in range(m-n+1):
            if haystack[i:i+n] == needle:
                return i
        return -1

