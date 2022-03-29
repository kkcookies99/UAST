 class Solution(object):
    def XXX(self, digits):
        L = len(digits)
        count = 1
        for i in range(L-1, -1, -1):
            if digits[i] + count > 9:
                digits[i] = (digits[i] + count) % 10
                count = 1
            else:
                digits[i] = (digits[i] + count)
                count = 0
        if count == 1:
            digits.insert(0,1)
        return digits

