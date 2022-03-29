class Solution:
    def XXX(self, x: int) -> bool:
        if x < 0:
            return False
        if x == 0:
            return True
        s = str(x)
        temp = s[::-1]
        temp = temp.lstrip("0")
        return s == temp

