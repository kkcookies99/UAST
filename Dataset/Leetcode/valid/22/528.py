 class Solution:
    def XXX(self, n: int) -> List[str]:

        ans = []

        def dfs( cur_str, l_num, r_num):
            if l_num == n and r_num == n:
                ans.append( cur_str)
                return
            
            if r_num > l_num:
                return
            
            if r_num > n or l_num > n:
                return

            dfs( cur_str+'(', l_num+1, r_num)
            dfs( cur_str+')', l_num, r_num+1)
        
        
        dfs( '', 0, 0)
        
        return ans

