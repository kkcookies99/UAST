 class Solution(object):
    def XXX(self, digits):
        i,f = len(digits)-1,True
        while i >= 0 and f:
            digits[i] = (digits[i] + 1) % 10
            f = digits[i] == 0
            i-=1
        if f: digits.insert(0,1)
        return digits


