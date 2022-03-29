 def XXX(self, n: int) -> List[str]:
        if n <= 0:
            return []
        if n == 1:
            return ['()']
        res = ['()']
        for i in range(1,n):
            res = set([k[0:j]+'()'+k[j:] for k in res for j in range(len(k)//2 + 1)])
        return list(res)

