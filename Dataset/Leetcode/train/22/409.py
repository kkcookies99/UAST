 class Solution(object):
    def XXX(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        ans_list = []
        def dfs(i, ans, match, total_left):
            if i == 2*n:
                ans_list.append(ans)
                return 
            if match==0:
                dfs(i+1, ans+'(', match+1, total_left+1)
            else:
                if total_left == n:
                    dfs(i+1, ans+')', match-1, total_left)
                else:
                    dfs(i+1, ans+'(', match+1, total_left+1)
                    dfs(i+1, ans+')', match-1, total_left)
 
        dfs(0, '', 0, 0)
        return ans_list 

