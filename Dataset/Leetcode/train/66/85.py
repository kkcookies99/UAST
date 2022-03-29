 class Solution(object):
    def XXX(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
       return [int(i) for i in list(str(int(''.join([str(i) for i in digits]))+1))]

