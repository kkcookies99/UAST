 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        n = len(nums)
        if n == 1:return True
        elif nums[0] == 0:
            return False
        max_step = nums[0]
        for i in range(1, n - 1):
            if max_step > i + nums[i]:
                pass
            else:
                max_step = i + nums[i]
            if max_step <= i:
                return False
        return True

