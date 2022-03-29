 class Solution:
    def XXX(self, num: int) -> str:
        map = [(1000, 'M'), (900, 'CM'), (500, 'D'), (400, 'CD'), (100, 'C'), (90, 'XC'),
               (50, 'L'), (40, 'XL'), (10, 'X'), (9, 'IX'), (5, 'V'), (4, 'IV'), (1, 'I')]
        res = ''
        index = 0
        while True:
            if num >= map[index][0]:
                num -= map[index][0]
                res += map[index][1]
            else:
                index += 1
            if num == 0:
                break
        return res


