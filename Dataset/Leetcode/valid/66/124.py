 class Solution(object):
    def XXX(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        n = len(digits)
        for i in range(n - 1, -1, -1) :
            digits[i] += 1
            digits[i] %= 10
            if digits[i] != 0 :
                return digits
        digits.insert(0, 1)
        return digits

