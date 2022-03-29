 class Solution:
    def XXX(self, strs: List[str]) -> str:
        res = ''
        res_lst = []
        if strs == [] or strs[0] == '':
            return res
        j = 0
        for c in strs[0]:
            if j < len(strs[0]):
                for i in range(1, len(strs)):
                    if j < len(strs[i]) and c == strs[i][j]:
                        continue
                    else:
                        for r in res_lst:
                            res += r
                        return res
                j += 1
                res_lst.append(c)
        for r in res_lst:
            res += r
        return res

