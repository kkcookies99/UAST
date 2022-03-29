 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        r = [len(set(c)) == 1 for c in zip(*strs)] + [0]
        return strs[0][:r.index(0)] if strs else ''
        """
        ret = []
        for item in zip(*strs):
            if len(set(item))== 1:
                ret.append(1) 
            else:
                ret.append(0)
        if ret.count("0") == 0:
            ret.append(0)
        if strs:
            return strs[0][:ret.index(0)]
        else:
            return ""
            

        

