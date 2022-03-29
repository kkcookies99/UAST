 class Solution:
    def XXX(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        prev = 1
        i = 1
        while(i <= len(digits)):
            if digits[-i] + prev == 10:
                prev = 1
                digits[-i] = 0
                i += 1
            else:
                digits[-i] += 1
                break
        
        if (i == len(digits) + 1) and prev == 1:
            digits = [1] + digits
        
        return digits

