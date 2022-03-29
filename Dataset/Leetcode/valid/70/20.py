class Solution:
    # 这里加了缓存装饰器！！！
    @functools.lru_cache(100)
    def XXX(self, n):
        """
        :type n: int
        :rtype: int
        """
        return self.XXX(n - 1) + self.XXX(n - 2) if n > 2 else n
        

