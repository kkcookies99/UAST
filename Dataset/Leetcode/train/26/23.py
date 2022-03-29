 class Solution:
    def XXX(self, nums: List[int]) -> int:
        i = 0
        while i < len(nums) - 1:
            if nums[i] == nums[i + 1]:
                nums.pop(i+1)
                i -= 1  # 移除重复元素之后，列表长度-1，遍历下标同步-1
            i += 1
        return len(nums)

