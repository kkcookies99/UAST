 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if len(strs)==0:
            return ""
        ex = strs[0]
        for i in range(len(strs)):
            while strs[i].find(ex,0)!=0:
                ex = ex[0:len(ex)-1]
        if ex=="":
            return ""
        else:
            return ex

