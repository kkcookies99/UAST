 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        if not needle:
            return 0
        lh,ln = len(haystack),len(needle)
        next,j = [0 for _ in range(ln)],0
        for i in range(1,ln):                           # 注意i从1开始
            while needle[i]!=needle[j] and j > 0:       # 前后缀不相同
                j = next[j-1]                           # 向前回溯
            if needle[i] == needle[j]:                  # 找到相同的前后缀
                j += 1
            next[i] = j                                 # 将j（前缀的长度）赋给next[i]
        j = 0                                           # 因为next数组里记录的起始位置为0
        for i in range(lh):                             # 注意i就从0开始
            while haystack[i]!=needle[j] and j > 0:     # 不匹配
                j = next[j-1];                          # j 寻找之前匹配的位置
            if haystack[i] == needle[j]:                # 匹配，j和i同时向后移动
                j += 1;
            if j == ln:                                 # 文本串haystack里出现了模式串needle
                return i - ln + 1;
        return -1;

