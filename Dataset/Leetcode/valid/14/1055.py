 class Solution:
    def XXX(self, strs):
        res = strs[0]
        for s in strs[1:]:
            # 分两种情况讨论
            if len(s) >= len(res):
                for i in range(len(res)):
                    if res[i] != s[i]:
                        if len(res) > len(s[: i]):
                            res = s[: i]
                            break
            else:
                if s == '':
                    res = ''
                for i in range(len(s)):
                    if s[i] != res[i]:
                        if len(res) > len(s[: i]):
                            res = s[: i]
                            break
                    if i == len(s) - 1 and s == res[: i + 1]:
                        res = s
        return res

