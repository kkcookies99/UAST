 class Solution:
    def XXX(self, s: str) -> str:
        l = len(s)
        ans = s[0]
        def find_ans(i,j):
            now_ans = s[i]
            if s[i] != s[j]:
                return s[i]
            now_ans = s[i:j + 1]
            n = 0
            while (i-n >= 0 and j+n < l):
                if s[i-n] == s[j+n]:
                    now_ans = s[i-n:j+n+1]
                else:
                    break
                n += 1
            return now_ans
        for i in range(l-1):
            ans1 = find_ans(i,i+1)
            ans2 = find_ans(i,i)
            ans1  = ans2 if len(ans1) < len(ans2) else ans1
            ans  = ans1 if len(ans) < len(ans1) else ans
        return ans

