 class Solution:
    def XXX(self, s: str) -> str:
        G = {'max': 0, 's': s[0]}

        def dan(idx, n):
            l = idx - n
            r = idx + n

            if l >= 0 and r < s_len:
                if s[l] == s[r]:
                    len_now = r - l + 1
                    if len_now > G['max']:
                        G['max'] = len_now
                        G['s'] = s[l:r + 1]
                    dan(idx, n + 1)

        def shuang(idx, n):
            l = idx - n
            r = idx + n + 1
            if l >= 0 and r < s_len:
                if s[l] == s[r]:
                    len_now = r - l + 1
                    if len_now > G['max']:
                        G['max'] = len_now
                        G['s'] = s[l:r + 1]
                    shuang(idx, n + 1)

        s_len = len(s)
        for i in range(1, s_len):
            dan(i, 1)           # aba      i => b
            shuang(i - 1, 0)    # abba     i => bb
            if (s_len - i - 1) * 2 < G['max']:
                break
        return G['s']

