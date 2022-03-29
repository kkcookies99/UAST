class Solution:
    def XXX(self, a: str, b: str) -> str:
        _a = [int(i) for i in a]
        _b = [int(i) for i in b]

        a_len, b_len = len(_a), len(_b)

        # 将a b两个长度固定相等
        _a = [0] * b_len + _a
        _b = [0] * a_len + _b

        index = 0  # 表示进位
        res = [0] * (a_len + b_len)

        for i in range(len(res) - 1, -1, -1):
            tmp = _a[i] + _b[i] + index

            if tmp == 2:
                index = 1
                res[i] = '0'
            elif tmp < 2:
                res[i] = str(tmp)
                index = 0
            else:
                res[i] = '1'
                index = 1

        # 如果还有进位，则首位加1
        if index == 1:
            res.insert(0, str(index))
       
        for i in range(len(res)):
            if int(res[i]) > 0:
                return ''.join(res[i:])
        # 全是0的情况
        return '0'


