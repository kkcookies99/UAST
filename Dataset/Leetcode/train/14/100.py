 class Solution:
    def XXX(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if "" in strs:
            return ""
        n = len(strs)
        if n > 1:
            pr = ""
            for index,i in enumerate(strs[0]):
                pr += i
                for j in range(1, n):
                    if pr not in strs[j][:index+1]:
                        break
                else:
                    continue
                break
            else:
                return pr
            return pr[:-1]
        else:
            return "" if not n else strs[0]

