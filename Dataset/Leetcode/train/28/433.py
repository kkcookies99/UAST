 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if(len(needle)==0):
            return 0
        s=0
        e=len(needle)
        while(s+e<=len(haystack)):
            if(haystack[s:s+e]==needle):
                return s
            s=s+1
        return -1

