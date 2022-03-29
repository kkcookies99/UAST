 class Solution(object):
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        Dict = {}
        res=0
        left=-1
        for i in range(len(s)):
            if s[i] in Dict and Dict[s[i]]>left:
                left=Dict[s[i]]
            Dict[s[i]]=i
            res=max(res,i-left)
        return res

