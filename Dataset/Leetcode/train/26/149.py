 class Solution:
    def XXX(self, nums: List[int]) -> int:
        if len(nums) == 0:
            return 0
        t = 0                           # 初始位置
        for i in range(1, len(nums)):
            if nums[i] != nums[t]:
                nums[t+1] = nums[i]     # 遇到一个和前面不同的，添加
                t += 1
        return t+1

