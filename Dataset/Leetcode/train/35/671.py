 class Solution:
    def XXX(self, nums: list[int], target: int) -> int:
        if target in nums:
            return nums.index(target)
        else:
            n=0
            for i in range(len(nums)):
                if target>nums[i]:
                    n+=1
                else:
                    break
            return n

