 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        fast, slow = 0, 0
        while fast < len(nums):
            if nums[fast] != val:
                nums[fast], nums[slow] = nums[slow], nums[fast]
                slow += 1
            fast += 1
        return slow

