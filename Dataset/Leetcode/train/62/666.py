class Solution:
    def XXX(self, m: int, n: int) -> int:
        # 本质是排列
        # m = 3, n = 2
        # 向右2步，向下1步，C31 = 3
        # m = 7, n = 3
        # 向右6步，向下2步，C82 = 28
        right = m - 1
        down = n - 1
        total = m + n - 2
        small = down
        if right < down:
            small = right
        res = 1
        div = 1
        i = 0
        while small > i:
            res *= total 
            total -= 1
            i += 1
            div *= i
        return res // div
        

