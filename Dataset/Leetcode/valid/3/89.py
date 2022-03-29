 class Solution:
    def XXX(self, s: str) -> int:
        Max = 0
        if len(s) != 0:
            Subs = s[0]
        else: return 0
        for i in range(len(s)):
            flag = Subs.find(s[i])
            Subs = Subs + s[i] if (flag == -1) else Subs[flag + 1:] + s[i]
            Max = len(Subs) if len(Subs) > Max else Max
        return Max

