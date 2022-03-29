 class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        ret = []
        def dfs(curStr,left,right,n,ret):
            if left == n and right == n:
                ret.append(curStr)
                return
            if left < right:
                return
            if left < n:
                dfs(curStr+'(',left+1,right,n,ret)
            if right < n:
                dfs(curStr+')',left,right+1,n,ret)
        dfs('',0,0,n,ret)
        return ret

