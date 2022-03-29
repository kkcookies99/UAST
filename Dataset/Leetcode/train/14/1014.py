 class Solution:
    def XXX(self, strs: List[str]) -> str:
        min_str = strs[0]
        length = len(strs[0])
        for s in strs:
            if len(s) < length:
                min_str = s
                length = len(min_str)

        strs.remove(min_str)
        result = ''

        i = 0
        while i < length:
            flag =True
            j = 0
            while j < len(strs):
                if min_str[i] != strs[j][i]:
                    flag = False
                    break
                j += 1
            if flag == True:
                result = result + min_str[i]
            else:
                break
            i += 1
        return result

