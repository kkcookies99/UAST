 class Solution:
    def XXX(self, num: int) -> str:
        data = {1: 'I', 5: 'V', 10: 'X', 50: 'L', 100: 'C', 500: 'D', 1000: 'M'}
        ans = ""
        i = 0
        while num:
            cur = (num % 10) * (10 ** i)
            num = num // 10
            while cur >= 1:
                if cur in data:
                    ans = data[cur] + ans
                    cur -= cur
                else:
                    if cur + 10**i == 5 * 10 ** i:
                        ans = data[10 ** i] + data[5 * 10 ** i] + ans
                        cur -= 4 * 10 ** i
                    elif cur + 10**i == 10 ** (i + 1):
                        ans = data[10 ** i] + data[10 * 10 ** i] + ans
                        cur -= 9 * 10 ** i
                    else:
                        ans = data[10 ** i] + ans
                        cur -= 10 ** i
            i += 1
        return ans

