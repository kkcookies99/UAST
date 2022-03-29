 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        count = len(nums)
        for i in nums:
            if i == val:
                count -= 1
                nums.remove(val)
        return count

