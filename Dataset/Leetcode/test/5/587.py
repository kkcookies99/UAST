 class Solution:
    def XXX(self, s: str) -> str:
        def palindrome(st: str, left: int, right: int):
            # 防止索引越界
            while left >= 0 and right < len(st) and st[left] == st[right]:
                # 向两边展开
                left -= 1
                right += 1
            # 返回以 s[l] 和 s[r] 为中心的最长回文串
            return st[left + 1: right]

        # 用n来装字符串长度，res来装答案
        length = len(s)
        res = ""
        # 字符串长度小于2，就返回本身
        if length < 2: return s
        for i in range(length - 1):
            # 以 s[i] 为中心的最长回文子串
            s1 = palindrome(s, i, i)
            # 以 s[i] 和 s[i+1] 为中心的最长回文子串
            s2 = palindrome(s, i, i + 1)
            # s1，res,s2 谁长取谁
            res = sorted([res, s1, s2], key=lambda x: -len(x))[0]
        return res

