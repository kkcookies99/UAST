 class Solution(object):
    def XXX(self, haystack, needle):
        j=len(needle)
        if needle=="":
                return 0
        for i in range(len(haystack)):
            
            if haystack[i]==needle[0]:
                a=haystack[i:i+len(needle)]
                if needle==a:
                    return i
               
            else:
                i=i+1
        return -1
            

