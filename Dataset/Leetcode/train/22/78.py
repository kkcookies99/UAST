 class Solution:
    def XXX(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        self.res = []
        self.singleStr('', 0, 0, n)
        return self.res

    def singleStr(self, s, left, right, n):
        if left == n and right == n:
            self.res.append(s)
        if left < n:
            self.singleStr(s + '(',left + 1, right, n)
        if right < left:
            self.singleStr(s + ')',left, right + 1, n)

