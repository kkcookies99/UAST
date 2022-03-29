 class Solution(object):
    d=[[""],["()"]]
    def XXX(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        d = self.d
        if n < len(d):
            return d[n]
        for i in range(len(d), n+1):
            t = set()
            for m in range(1, i):
                for s1 in d[i-m]:
                    for s2 in d[m]:
                        for iD in range(len(s1)+1):
                            t.add(''.join([s1[:iD], s2 , s1[iD:]]))
            d.append(list(t))
            i += 1
        return d[n]

