 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        for i in range(len(nums)):
            if val in nums:
                nums.remove(val)
            else: break
        return len(nums)

