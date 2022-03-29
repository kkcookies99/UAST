 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        for i in range(len(nums)-1, -1, -1):
            if nums[i] == val:
                nums.pop(i)
            i -= 1           
        return len(nums)

