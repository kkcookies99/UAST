 class Solution:
    def XXX(self, n: int) -> List[str]:
        if not n : return []
        result = set()
        result.add('()')
        while n>1:
            t_r = set()
            while result:
                tp = result.pop()
                for i in range(len(tp)):
                    t_r.add(tp[:i] + '()' + tp[i:])
                t_r.add('('+tp+')')
            result = t_r
            n -= 1
        return list(result)

