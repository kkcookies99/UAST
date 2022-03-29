 class Solution:
    def XXX(self, digits: List[int]) -> List[int]:
        m = digits[len(digits) - 1] + 1
        s = 0
        for i in range(len(digits) - 1):
            s += (digits[i] * (10 ** (len(digits) - i - 1)))
        s += m
        h = []
        while s!=0:
            i=s%10
            s=int(s//10)
            h.insert(0,i)
        return h

