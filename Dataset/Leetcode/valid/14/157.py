 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        
        prefix = []
        for t in zip(*strs):
            s = set(t)
            if(len(s) == 1):
                prefix.append(s.pop())
            else:
                break
                
        return "".join(prefix)

