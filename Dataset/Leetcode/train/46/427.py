 class Solution:
    def dfs(self, nums, ans, cur):
        n = len(nums)
        if len(cur) == n:
            ans.append(cur)
            return
        
        for i in range(0, n):
            # 时间花费主要在not in中, 如果可以增加一个变量保存这个关系, 应该会快
            if nums[i] not in cur:
                self.dfs(nums, ans, cur + [nums[i]])

    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums.sort()

        ans = []
        self.dfs(nums, ans, [])

        return ans