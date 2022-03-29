 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        digits = [str(i) for i in digits]
        ss = str(int(''.join(digits))+1)
        res = [int(i) for i in ss]
        return res

