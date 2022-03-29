 class Solution(object):
    def XXX(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        digits[-1] += 1
        right = len(digits)-1
        while digits[right] ==10:
            digits[right] = 0
            if right!=0:
                right-=1
                digits[right]+=1
            else:
                digits.insert(0,1)
    
        return digits

