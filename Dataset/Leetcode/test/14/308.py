 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
     
        l = sorted(strs,key=lambda x:len(x))
        s = l[0]
        for i in range(len(s)-1,-1,-1):
            for  x in l[1:]:
                if x[:i+1] != s[:i+1]:
                    break
            else:
                return s[:i+1]
        else:
            return ""   
            

