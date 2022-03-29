 class Solution:
    def XXX(self, nums: List[int]) -> int:
        if not nums:
            return 0
        slow = 0
        for fast in range(1, len(nums)):
            if nums[fast] == nums[slow]:
                continue
            nums[slow + 1] = nums[fast]
            slow += 1
        # print(nums)
        return slow + 1

