 class Solution(object):
    def __init__(self):
        self.res = []

    def XXX(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        self.dfs(n, n, n, [])
        return self.res

    def dfs(self, left, right, n, temp):
        if len(temp) == 2 * n:
            self.res.append("".join(temp))
            return
        if left > 0:
            temp.append("(")
            self.dfs(left - 1, right, n, temp)
            temp.pop()
        if right > 0 and right > left:
            temp.append(")")
            self.dfs(left, right - 1, n, temp)
            temp.pop()

