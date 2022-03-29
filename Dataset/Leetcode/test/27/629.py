 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        # 双指针算法
        slow = 0
        for fast in range(len(nums)):
            if not nums[fast] == val:
                nums[slow] = nums[fast]
                slow += 1
        return slow

