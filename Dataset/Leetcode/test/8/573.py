 class Solution:
    def XXX(self, s: str) -> int:
        n = len(s)

        flag = ''
        ans = 0
        start = False

        for i in range(n):
            if not start and s[i] == ' ':
                continue
                
            if s[i] in ['+', '-']:
                if not start:
                    flag = s[i]
                    start = True
                    continue
                else:
                    break

            if s[i].isdigit():
                ans = ans * 10 + int(s[i])
                start = True
            else:
                break

        ans = -ans if flag == '-' else ans  
        ans = max(-2**31, ans)
        ans = min(2**31-1, ans)

        return ans

