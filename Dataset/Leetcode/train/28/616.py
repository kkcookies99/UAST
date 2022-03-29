 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:

        if needle=="" or haystack==needle:
            return 0
        
        if len(haystack)<len(needle):
            return -1
        
        n=len(needle)
        for i in range(len(haystack)):

            if haystack[i]==needle[0]:
                
                if i+(n-1)<len(haystack) and haystack[i:i+n]==needle:
                    return i

        return -1

