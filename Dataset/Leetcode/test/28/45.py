 class Solution:
    def XXX(self, haystack: str, needle: str) -> int:
        next = self.generate_next(needle)
        needle_lenght = len(needle)
        haystack_lenght = len(haystack)
        if needle_lenght==0:
            return 0
        j = 0
        i = 0
        while i < haystack_lenght and j < needle_lenght:
            #相等就一起往前走
            if needle[j] == haystack[i]:
                j += 1
                i += 1
            else:
                #不相等--模式串，已经在第一个位置了，那么文本串要往前移动一位
                if j==0:
                    i+=1
                else:
                    #不相等，模式串不在第一位，那么久只需要移动模式串就好
                    j =next[j - 1]
            if j >= needle_lenght:
                return i - j


        return -1

    # 生成next数组
    def generate_next(self, s: str) -> List:
        next = [0] * len(s)
        prefix = 0
        for suffix in range(1, len(s)):
            while prefix > 0 and s[prefix] != s[suffix]:
                prefix = next[prefix - 1]
            if s[prefix] == s[suffix]:
                prefix += 1
            next[suffix] = prefix
        return next


