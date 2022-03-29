 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        if numRows == 1:
            return s
        step = 2 * numRows - 3 + 1
        n = s.__len__()
        r = []
        # 第一行
        r.extend([s[i] for i in range(0, n, step)])
        for i in range(1, numRows - 1):
            t = i
            while t < n:
                r.append(s[t])
                o_index = t + step - i * 2
                if o_index < n:
                    r.append(s[o_index])
                t = t + step
        # 最后一行
        r.extend([s[i] for i in range(numRows - 1, n, step)])
        return ''.join(r)

