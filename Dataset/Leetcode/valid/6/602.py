 class Solution(object):
    def XXX(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows == 1:
            return s
        else:
            obj = {}
            count = 0
            tag = True
            for a in range(numRows):
                obj["{}".format(a)] = []
            for i in range(len(s)):
                obj["{}".format(count)].append(s[i])
                if count == 0:
                    tag = True
                elif count == numRows-1:
                    tag = False
                if tag:
                    count += 1
                else:
                    count -= 1
            result = []
            for b in range(numRows):
                result.extend(obj["{}".format(b)])
            strs = ''.join(result)
            return strs

