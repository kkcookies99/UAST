 class Solution:
    def XXX(self, nums: List[int]) -> int:
        if not nums:
            return 0
        if len(nums) == 1:
            return 1
        index = 0
        while index < len(nums) - 1:
            cur_num = nums[index]
            next_num = nums[index+1]
            if cur_num != next_num:
                index += 1
            elif cur_num == next_num:
                nums.pop(index)
        return len(nums)

