 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        '''
        remove val in-place
        '''
        slow = 0
        for fast in range(len(nums)):
            if nums[fast] == val:
                continue
            nums[slow] = nums[fast]
            slow += 1
        return slow

