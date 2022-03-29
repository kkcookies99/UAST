class Solution:
    def XXX(self, n: int) -> int:
        dic = {}
        for i in range(1, 50):
            if i == 1 or i == 2:
                dic.setdefault(i, i)
            else:
                dic.setdefault(i, dic.get(i - 1) + dic.get(i - 2))
        return dic.get(n)

