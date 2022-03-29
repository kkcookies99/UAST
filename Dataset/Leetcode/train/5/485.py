 class Solution:
    def is_palindromic_string(self,s):
        return s == s[::-1]

    def XXX(self, s: str) -> str:
        if not s:
            return ''
        n = len(s)
        for i in range(n):
            start = 0
            end = n-i
            """
            从最长字符串开始扫,如果不是回文串则扫描的字符串长度递减1
            如果扫描到的是回文串则中断扫描
            """
            while end<=n:
                sub_string = s[start:end]
                if self.is_palindromic_string(sub_string):
                    return sub_string
                start+=1
                end+=1

