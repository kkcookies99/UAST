class Solution:
    def XXX(self, nums: List[int]) -> None:
        left, right, currIdx = 0, len(nums) - 1, 0
        while currIdx <= right:
            if nums[currIdx] == 0:
                nums[left], nums[currIdx] = nums[currIdx], nums[left]
                left += 1
                currIdx += 1
            elif nums[currIdx] == 2:
                nums[right], nums[currIdx] = nums[currIdx], nums[right]
                right -= 1
            else: # 1
                currIdx += 1


