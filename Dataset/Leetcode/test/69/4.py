class Solution:
    def XXX(self, x: int) -> int:
        if x < 1: return 0
        i = 1
        while True:
            s = i**2
            if s <= x:
                T = i
                t = x / s
                if t >= 100000000:
                    i *= 10000
                elif t >= 7500 ** 2:
                    i *= 7500
                elif t >= 6000 ** 2:
                    i *= 6000
                elif t >= 25000000:
                    i *= 5000
                elif t >= 3000 ** 2:
                    i *= 3000
                elif t >= 2000 ** 2:
                    i *= 2000
                elif t >= 1000000:
                    i *= 1000
                elif t >= 900 ** 2:
                    i *= 900
                elif t >= 800 ** 2:
                    i *= 800
                elif t >= 700 ** 2:
                    i *= 700
                elif t >= 600 ** 2:
                    i *= 600
                elif t >= 250000:
                    i *= 500
                elif t >= 10000:
                    i *= 100
                elif t >= 2500:
                    i *= 50
                elif t >= 100:
                    i *= 10
                elif t >= 81:
                    i *= 9
                elif t >= 64:
                    i *= 8
                elif t >= 49:
                    i *= 7
                elif t >= 36:
                    i *= 6
                elif t >= 25:
                    i *= 5
                elif t >= 16:
                    i *= 4
                elif t >= 9:
                    i *= 3
                elif t >= 4:
                    i *= 2
                else:
                    i += 1
            else: return T

