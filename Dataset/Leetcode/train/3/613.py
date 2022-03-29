 class Solution:
    def XXX(self, s):
        num = 0
        result = 0
        list = []
        if len(s) == 0:
            return num
        for i in s:
            if i not in list:
                list.append(i)
            else:
                num = len(list)
                if num > result:
                    result = num
                list = [i]
        return result

