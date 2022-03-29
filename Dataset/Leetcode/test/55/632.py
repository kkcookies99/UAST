 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        count = 0
        for i in range(len(nums)):
            count = max(count - 1, nums[i])
            if count == 0 and i != (len(nums) - 1):
                break
        else:
            return True
        return False

