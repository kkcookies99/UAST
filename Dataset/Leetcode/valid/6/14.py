 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows < 2:
            return s 
        grid = [[] for _ in range(numRows)]
        cycle = 2*numRows - 2 # 循环周期
        for i in range(len(s)):
            pos = i % cycle
            if 0 <= pos <= numRows-1: # Z字的上面一横
                grid[pos].append(s[i])
            else:  # Z字的中间一折
                grid[cycle-pos].append(s[i])
        ans = ''
        for row in grid:
            ans += ''.join(row)
        return ans

