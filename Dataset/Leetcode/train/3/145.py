 class Solution:
    def XXX(self, s: str) -> int:
        d = []        
        if len(s) == 0:
            return 0
        for i in range(0, len(s)):
            flag = 1
            tmp = s[i]
            for j in range(i + 1, len(s)):
                if s[j] != s[i] and s[j] not in tmp:
                    flag += 1
                else:
                    flag = 1
                    break
                tmp += s[j]
                d.append(flag)
            if len(d) == 0:
                d.append(flag)
        rst = max(d)
        return rst

