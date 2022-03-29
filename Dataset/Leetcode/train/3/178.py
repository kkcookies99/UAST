
class Solution:
    def XXX(self, s: str) -> int:
        if len(s) == 0:
            return 0

        chars = {}
        pre_idx = 0
        chars[s[0]] = 0
        res = 0
        for i in range(1, len(s)):
            chars.setdefault(s[i], -1)
            if chars[s[i]] != -1:
                cur_len = i - pre_idx
                if chars[s[i]] + 1 >= pre_idx:
                    pre_idx = chars[s[i]] + 1
                if cur_len > res:
                    res = cur_len
            res = max(res, i - pre_idx)
            chars[s[i]] = i
        if len(s) - pre_idx > res:
            res = len(s) - pre_idx
        return res
