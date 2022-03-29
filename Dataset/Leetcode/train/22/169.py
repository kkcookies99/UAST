 class Solution(object):
    def XXX(self, n):
        if n == 1:
            return ['()']
        results = set([])
        for i in range(1, n):
            l1 = self.XXX(i)
            l2 = self.XXX(n - i)
            for item1 in l1:
                for item2 in l2:
                    results.add(item1[:-1] + item2 + ')')
                    results.add(item1 + item2)
        return list(results)

