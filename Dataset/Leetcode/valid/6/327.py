 class Solution(object):
    def XXX(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows == 1:
            return s
        if s == '':
            return s
        tmparr = []
        for i in range(numRows):
            tmparr.append([])

        count, strsit = 0, 0
        while True:            
            for i in range(numRows):
                if count % (numRows-1) == 0:
                    #满列
                    tmparr[i].append(s[strsit])
                    strsit = strsit+1
                    if len(s) <= strsit:
                        break
                else:
                    if i + count%(numRows-1) == numRows -1:
                        tmparr[i].append(s[strsit])
                        strsit = strsit+1
                        if len(s) <= strsit:
                            break
            count = count+1
            if len(s) <= strsit:
                break
        resstr = ''
        for i in range(numRows):
            resstr = resstr +"".join(tmparr[i])
        return resstr

