 class Solution(object):
    def XXX(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        n, count = len(digits), 1
        for i in range(n-1, -1, -1):
            digits[i] += count
            if digits[i] == 10:
                digits[i] = 0
            else:
                break
        if digits[0] == 0:
            digits[0] = 1
            digits.append(0)
        return digits

