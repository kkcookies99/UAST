class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        ans = []
        def dfs(wait_list, now_list):
            if wait_list == []:
                ans.append(now_list)
                return 
            for i in range(len(wait_list)):
                dfs(wait_list[:i]+wait_list[i+1:],now_list + [wait_list[i]])
        dfs(nums,list())
        return ans

