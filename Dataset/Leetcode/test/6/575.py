 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        dp = ['']*numRows
        bei = 0
        dir = -1
        for zimu in s:
            if dir == 1:
                if bei < numRows-1:
                    dp[bei] += zimu
                    bei += 1
                elif bei == numRows-1:
                    dp[bei] += zimu
                    dir = -1
                    bei -= 1
            elif dir == -1:
                if bei > 0:
                    dp[bei] += zimu
                    bei -= 1
                elif bei == 0:
                    dp[bei] += zimu
                    dir = 1
                    bei +=1
        return ''.join(dp)

