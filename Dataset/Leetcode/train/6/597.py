 class Solution(object):
    def XXX(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        key=0
        key1=1
        lsit=['' for i in range(numRows)]
        str1=''
        if numRows==1:
            return s
        for i in s:
            lsit[key]+=i
            key+=key1
            if key==numRows-1 or key==0:
                key1=-key1
        for key in lsit:
            str1+=key
    
        return str1     


