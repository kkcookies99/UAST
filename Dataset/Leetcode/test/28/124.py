 class Solution(object):
    def XXX(self, haystack, needle):
        """
        :type haystack: str
        :type needle: str
        :rtype: int
        """
        if needle=='':
            return 0
        
        l = len(needle)
        L = len(haystack)
        if l > L: return -1
        
        
        for i in range(L-l+1):
            if haystack[i] == needle[0]:
                
                tag=1
                for j in range(l):
                    if haystack[i+j] != needle[j]:
                        tag=0
                        break
                
                if tag:
                    return i
                else:
                    pass
                
        return -1