 class Solution:
    def XXX(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows==1: return s
        n=len(s)
        cycle=2*numRows-2
        result=""
        for i in range(numRows):
            for j in range(i,n,cycle):
                result+=s[j]
                if i!=0 and i!=numRows-1 and j+cycle-2*i<n:
                    result+=s[j+cycle-2*i]
        return result

