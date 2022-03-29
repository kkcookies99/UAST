 class Solution(object):
    def XXX(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        j = len(digits)-1
        while j>=0:
            if digits[j]+1 < 10:
                digits[j]+=1
                break
            else:
                digits[j]=0
            j-=1
        
        if digits[0] == 0:
            return [1]+digits
        else:
            return digits

