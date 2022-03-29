 class Solution:
    def XXX(self, strs: List[str]) -> str:
        min_times = min(map(len,strs))
        if min_times == 0:
            return ''
        res = ''
        for index in range(min_times):
            temp = strs[0][index]
            for _str in strs[1:]:
                if temp != _str[index]:
                    return res
            res += temp
        return res

