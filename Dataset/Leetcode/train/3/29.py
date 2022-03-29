 class Solution:
    def XXX(self, s: str) -> int:
        str2ind = {}
        slen = len(s)
        max_len = 0
        j = -1 # 左指针

        for i in range(slen):
            # i 为右指针
            #  str2ind[s[i]] > j 保证发现的重复字符在j右侧
            if s[i] in str2ind and str2ind[s[i]] > j:
                j = str2ind[s[i]]
    
            length = i - j
            str2ind[s[i]] = i

            if length > max_len:
                max_len = length
        return max_len

