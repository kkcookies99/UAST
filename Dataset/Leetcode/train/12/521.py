 class Solution:
    def XXX(self, num: int) -> str:
        d = {
            1: "I",
            5: "V",
            10: "X",
            50: "L",
            100: "C",
            500: "D",
            1000: "M",
        }
        m = 1
        ans = []
        while num:
            n = num % 10
            if n == 4 or n == 9:
                ans.append(d[m] + d[(n + 1) * m])
            elif n >= 5:
                ans.append(d[5 * m] + d[m] * (n - 5))
            else:
                ans.append(d[m] * n)
            m *= 10
            num //= 10
        return "".join(ans[::-1])        

