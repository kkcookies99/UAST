class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        dfs_list = [[]]
        def dfs(nums:List[int],res):
            if not nums:
                return
            for i in range(len(nums)):
                res.append(nums[i])
                dfs_list.append(res.copy())
                dfs(nums[i+1:len(nums)],res)
                res.pop()
        dfs(nums,[])
        return dfs_list

