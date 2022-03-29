 class Solution:
    def XXX(self, n: int) -> str:
        cs = '1'
        for i in range(n - 1):
            length = len(cs)
            i = 0
            temp = ''
            while i < length:
                curchar = cs[i]
                count = 1
                while i < length and i + 1 < length and cs[i + 1] == cs[i]:
                    count += 1
                    i += 1
                temp += str(count) + curchar
                i += 1
            cs = temp
        return cs 

