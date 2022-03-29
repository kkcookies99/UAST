 class Solution:
    def XXX(self, n: int) -> List[str]:
        ret = set(['()'])
        for i in range(1,n):
            tmp = set()
            for j in ret:
                a = '(' + j + ')'
                tmp.add(a)
                for k in range(len(j)):
                    a = j[:k+1] + '()' + j[k+1:]
                    tmp.add(a)
            ret = tmp
        return list(ret)

