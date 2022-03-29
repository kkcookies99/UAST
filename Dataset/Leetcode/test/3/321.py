 class Solution:
    def XXX(self, s):
        """
        :type s: str
        :rtype: int
        """
        max_number = 0
        test = ""
        for chr_ in s:
            if chr_ not in test:
                test += chr_        
            else:
                max_number=max(len(test),max_number)
                test=test[test.index(chr_)+1:]+chr_
        return max(len(test),max_number)

