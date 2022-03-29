 class Solution:
    def XXX(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows <= 1:
            return s
        rows = [ [] for i in range(numRows)]
        j = 0 #J代表第几行，在第一行与最后一行间不断往返
        a = 1
        for i in s:
            rows[j].append(i)
            if j == numRows - 1:
                a = -1 
            if j == 0:
                a = 1 
            j += a

        ans = []
        for i in rows:
            ans.extend(i)
        ans = "".join(ans)
        #print(ans)
        return ans

