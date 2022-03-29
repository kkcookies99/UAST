 class Solution:
    def XXX(self, nums: List[int]) -> int:
        
        if None == nums or 0 == len(nums):
            return 0
        
        if 1 == len(nums):
            return 1
        
        i = 0
        j = 0
        # 初始 nums[i] == nums[j]
        # i 和 j 指向相同
        while j < len(nums) - 1:
            # j不在等值区间尾? 移动 j 到等值区间尾
            if nums[j] == nums[j + 1]:
                j += 1
            # 在等值区间尾? 移动 i 到下一可写区, 移动 j 到下一等值区间头, 从j写到i
            else:
                i += 1
                j += 1
                nums[i] = nums[j]

        # 最终 j 位于 len(nums) - 1, i 位于最后的已写区间尾, 已写
        return i + 1

