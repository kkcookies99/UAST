 class Solution:
    def XXX(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        num = list(range(1,numRows+1))+list(range(numRows-1,1,-1))
        n = len(num)
        m = len(s)
        k = m//n
        r = m%n
      #生成一个序列标行标
        seq = k*num + num[0:r]       
        out = [""]*numRows        
        for i in range(m):
            out[seq[i]-1] += s[i]
            
        return ''.join(out)
        

