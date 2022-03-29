 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        res = ''
        size = len(strs)
        if size == 0:
            return res
        
        min_size = min([len(s) for s in strs])
        for i in range(min_size):
            if len(set([s[i] for s in strs])) == 1:
                res += strs[0][i]
            else:
                break
        return res

