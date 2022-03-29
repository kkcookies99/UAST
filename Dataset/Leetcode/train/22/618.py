 class Solution:
    def XXX(self, n: int) -> List[str]:
        res = []
        track = ''
        option = '()'
        L = 0  # 添加计数器
        R = 0
        def backtrack(track, option, n, L, R):
            if (len(track) == 2 * n) & (L == n):
                res.append(track)
            
            for i in range(2):                
                if (len(track) > 2 * n) | (L > n)  | (R > L):  ## 右括号始种不能超过左括号数目
                   continue
                
                if i == 0:
                    L = L + 1
                else:
                    R = R + 1

                track = track + option[i]
                backtrack(track, option, n, L, R)
                track = track[:-1]

                if i == 0:
                    L = L - 1
                else:
                    R = R - 1
        
        backtrack(track, option, n, L, R)
        return res



