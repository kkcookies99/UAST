 class Solution(object):
    def XXX(self, num):
        """
        :type num: int
        :rtype: str
        """
        # 1 <= num <= 3999
        s = str(num)
        wei = len(s)-1
        pro = 10 ** wei
        res = ""
        while num:
            r = num/pro
            if pro == 1000:
                for _ in range(r):
                    res += 'M'
            elif pro == 100:
                if r > 5:
                    if r == 9:
                        res += 'CM'
                    else:
                        res += 'D'
                        r -= 5
                        for _ in range(r):
                            res += 'C'
                elif r == 5:
                    res += 'D'
                elif r < 5:
                    if r == 4:
                        res += 'CD'
                    else:
                        for _ in range(r):
                            res += 'C'
            elif pro == 10:
                if r > 5:
                    if r == 9:
                        res += 'XC'
                    else:
                        res += 'L'
                        r -= 5
                        for _ in range(r):
                            res += 'X'
                elif r == 5:
                    res += 'L'
                elif r < 5:
                    if r == 4:
                        res += 'XL'
                    else:
                        for _ in range(r):
                            res += 'X'
            elif pro == 1:
                if r > 5:
                    if r == 9:
                        res += 'IX'
                    else:
                        res += 'V'
                        r -= 5
                        for _ in range(r):
                            res += 'I'
                elif r == 5:
                    res += 'V'
                elif r < 5:
                    if r == 4:
                        res += 'IV'
                    else:
                        for _ in range(r):
                            res += 'I'
            num = num % pro
            pro //= 10
        return res

