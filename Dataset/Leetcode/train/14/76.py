 class Solution(object):
    def XXX(self, strs):
        if strs == []:
            return ''
        if len(strs) == 1:
            return strs[0]
        minL = 99999
        for item in strs:
            if minL > len(item):
                minL = len(item)
        if minL == 0:
            return ''
        pre = strs[0][0]
        flag = 0
        while flag < minL:
            for item in strs:
                now  = item[flag]
                if pre != now:
                    return item[:flag]
            flag += 1
            if flag == minL:
                return strs[0][:flag]
            else:
                pre = strs[0][flag]


