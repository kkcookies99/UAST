 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        i = 0
        while val not in nums:
            return len(nums)
        while val in nums:
            if nums[i] == val:
                nums.remove(nums[i])
            else:
                i += 1
        return len(nums)

