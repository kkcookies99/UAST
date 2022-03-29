 class Solution:
    def XXX(self, nums, target):
        for i in range(len(nums) - 1):
            base = nums[i]
            other = target - base
            if other in nums[i + 1:]:
                # 这里注意index设置start，避免出现target = 6，[3,3]返回[0,0]的错误
                return [i, nums.index(other, i + 1)]

