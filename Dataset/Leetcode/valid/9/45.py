class Solution:
    def XXX(self, x: int) -> bool:
        if x < 0:
            return False
        if x == 0:
            return True
        new_num = []
        dig = int(math.log10(x)) + 1
        for i in range(1, dig + 1):
            # look = 10 ** (dig - i)
            mid_num = x // (10 ** (dig - i))
            new_num.append(mid_num)
            x = x - mid_num * 10 ** (dig - i)

        while len(new_num)>1:
            if new_num[0] != new_num[-1]:
                return False
            else:
                new_num.pop(0)
                new_num.pop(-1)
            # print("*" * 50)
        else:
            return True

