class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: str
        """
        if n == 1:
            return "1"
        if n == 2:
            return "11"
        
        pre = "11"
        begin = 3
        while begin <= n:
            res = list()
            i = 0
            count = 1
            while i < len(pre):
                if i + 1 < len(pre):
                    if pre[i] == pre[i + 1]:
                        count = count + 1
                    else:
                        res.append(str(count))
                        res.append(pre[i])
                        count = 1
                else:
                    res.append(str(count))
                    res.append(pre[i])
                i += 1
            pre = res
            begin += 1
        return "".join(res)

