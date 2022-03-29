class Solution:
    def XXX(self, s: str) -> int:
        sum_dict = dict(I = 1, V = 5, X = 10, L = 50, C = 100, D = 500, M = 1000)
        sum = 0
        for str in s:
            sum += sum_dict[str]
        sum = sum - 2 * (s.count('IV') + s.count('IX')) - 20 * (s.count('XL') + s.count('XC')) - 200 * (s.count('CD') + s.count('CM'))
        return sum

