 class Solution(object):
    def XXX(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        total = ''
        for i in digits:
            total = total + str(i)
        digits = []  
        total =  int(total)+1
        for i in str(total):
            digits.append(int(i))
        return digits
            

