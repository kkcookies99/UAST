 class Solution:
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        result = ""
        if len(strs) > 0:      
            x = strs[0]
            for i, n in enumerate(x):
                for j in range(1,len(strs)):
                    if i <= (len(strs[j])-1) and n == strs[j][i]:
                        continue
                    else:
                        return result
                result += n
            return result
        else:
            return result

