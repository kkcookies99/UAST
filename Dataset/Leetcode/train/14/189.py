 class Solution(object):
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if len(strs) == 0:
            return ""
        import operator
        min_str, result = min(strs, key=len), ""
        for p, i in enumerate(min_str):
            if not reduce(operator.and_, [s[p] == i for s in strs]):
                break
            result += i
        return result


