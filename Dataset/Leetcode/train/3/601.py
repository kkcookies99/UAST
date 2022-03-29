 class Solution:
    def XXX(self, s: str) -> int:
        if s == '':
            return 0
        start, end = 0, 0   # 以当前字符结束的最大子串起止下标
        subl = 1   # 以当前字符结束的最大子串长度
        maxl = 1
        l = s.__len__()
        for i in range(1, l):
            ss = s[start:end+1]     # 以上一字符结束的最大子串
            index = ss.find(s[i])
            if index == -1:     # 当前字符未在子串出现，可以加入子串
                end += 1
            else:       # 当前字符重复, 子串位置后移（因为子串是不重复的，所以移动后得到的一定是不重复子串）
                start = start+index+1
                end += 1
            subl = end-start+1
            maxl = max(maxl, subl)
        return maxl

