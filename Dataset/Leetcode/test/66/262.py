 class Solution(object):
    def XXX(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        n = len(digits)

        incre = 1
        for i in range(n-1, -1, -1):
            if not incre > 0:
                break
            digits[i] += 1
            if digits[i] > 9:
                digits[i] = 0
            else:
                incre = 0
                break
        if incre:
            digits.insert(0, 1)
        return digits


