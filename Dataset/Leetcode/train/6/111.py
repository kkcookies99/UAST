 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        L = ['' for x in range(numRows)]
        n = 0
        flag = True
        for i in s:
            if n > numRows - 2:
                flag = False
            elif n <= 0:
                flag = True
            L[n] += i
            if flag:
                n += 1
            else:
                n -= 1
        return ''.join(L)
