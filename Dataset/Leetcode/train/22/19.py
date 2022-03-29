 class Solution:
    def XXX(self, n: int) -> List[str]:
        if n == 0:
            return [""]
        elif n == 1:
            return ["()"]
        elif n == 2:
            return ["()()", "(())"]
        result = []
        for i in range(n):
            j = n - 1 - i
            temp1 = self.XXX(i)
            temp2 = self.XXX(j)
            result.extend(["(%s)%s" % (p, q) for p in temp1 for q in temp2])
        return result

