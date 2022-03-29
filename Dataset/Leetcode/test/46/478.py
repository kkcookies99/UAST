 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        # 全排列，可以用递归
        if len(nums) == 1:
            return [nums]
        ans = []
        for i in range(len(nums)):
            arr = nums[:i] + nums[i+1:]
            ret = self.XXX(arr)
            for r in ret:
                ans.append([nums[i]] + r)
        return ans

