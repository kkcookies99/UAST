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
        if left == n and right == n:  # 如果左右括号数相同
            self.res.append(s)
        if left < n:                  # 左括号数小于n
            self.singleStr(s + '(',left + 1, right, n)
        if right < left:              # 左括号数小于n
            self.singleStr(s + ')',left, right + 1, n)

