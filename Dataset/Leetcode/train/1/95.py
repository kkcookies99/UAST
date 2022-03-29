 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
         j = i + 1
         while 1:
             if nums[i] + nums[j] == target:
                 return i, j
             else:
                 j += 1
                 if j >= len(nums):
                     break

