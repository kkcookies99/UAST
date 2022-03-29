 class Solution:
    def XXX(self, s: str) -> str:
        s = '#' + '#'.join([ch for ch in s]) + '#'
        # Python Version
        n = len(s)
        d1 = [0] * n
        l, r = 0, -1
        max_len = 1
        best_i = 0
        for i in range(0, n):
            k = 1 if i > r else min(d1[l + r - i], r - i + 1)
            while 0 <= i - k and i + k < n and s[i - k] == s[i + k]:
                k += 1
            d1[i] = k
            k -= 1
            if i + k > r:
                l = i - k
                r = i + k
            if s[i] == '#':
                cur_len = d1[i] // 2 * 2
                if max_len < cur_len:
                    max_len = cur_len
                    best_i = i
            else:
                cur_len = 1 + (d1[i] - 1) // 2 * 2
                if max_len <= cur_len:
                    max_len = cur_len
                    best_i = i
        # print(best_i, max_len, s)
        ans = ''.join([s[i] for i in range(best_i - max_len + 1, best_i + max_len, 2)])    
        return ans

