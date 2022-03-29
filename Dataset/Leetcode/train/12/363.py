 class Solution:
    def XXX(self, num: int) -> str:
        ans, bits = "",  0
        dic = {0: "IVX", 1: "XLC", 2: "CDM", 3: "MMM"}
        def transform(n: int, bits: int) -> str:
            if n == 1 and bits > 0:
                return dic[bits-1][2]
            c1, c2, c3 = dic[bits]
            if n < 4:
                return c1 * n
            elif n == 4:
                return c1 + c2
            elif 4 < n < 9:
                return c2 + c1 * (n - 5)
            elif n == 9:
                return c1 + c3
        while num:
            ans = transform(num % 10, bits) + ans
            num //= 10
            bits += 1
        return ans

