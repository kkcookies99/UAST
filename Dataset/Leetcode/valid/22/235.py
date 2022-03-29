     def XXX(self, n: int) -> List[str]:
        re = {''}
        for i in range(n):
            temp = set()
            for s in re:
                for j in range(len(s) + 1):
                    temp.add(s[:j] + '()' + s[j:])
            re = temp
            re = list(re)
            re.sort()
        return re

