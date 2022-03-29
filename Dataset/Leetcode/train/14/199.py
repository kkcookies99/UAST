 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if strs == [] :
            return ""
        min = len(strs[0])
        for item in strs:
            if len(item) <= min:
                min = len(item)
                minStr = item   
        
        for x in range(len(minStr)):
            c = minStr[x]
            for item in strs:
                if c != item[x]:
                    return "".join(minStr[0:x])
        return minStr

