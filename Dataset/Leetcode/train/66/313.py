 class Solution(object):
    def XXX(self, digits):
        """
        :type digits: List[int]
        :rtype: List[int]
        """
        num = ''.join(str(s) for s in digits)
        new = int(num)+1
        return list(str(new))

