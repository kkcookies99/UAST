class Solution:
    def XXX(self, x: int) -> bool:
        if x>=0:
            order = str(x)
            res_order = order[::-1]
            if order == res_order:
                return True
            else:
                return False
        else:
            return False

