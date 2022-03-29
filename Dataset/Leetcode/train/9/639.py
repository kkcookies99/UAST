 class Solution:
    def XXX(self, x: int) -> bool:
        if x < 0:
            return False
        ls = []
        x1 = x % 10
        x2 = x // 10
        while x2 > 0:
            ls.append(x1)
            x1 = x2 % 10
            if x2 >= 10:
                x2 = x2 // 10
            else:
                ls.append(x2)
                break
        return ls[:len(ls)//2] == ls[::-1][:len(ls)//2]

