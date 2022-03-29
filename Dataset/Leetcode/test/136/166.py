 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
            # 不适用额外空间，线性的时间复杂度
        nums.sort()
        for i in range(len(nums)):
            if nums[0] != nums[1]:
                return nums[0]
            elif i==len(nums)-1 and nums[i-1] != nums[i]:
                return nums[i]
            elif nums[i] != nums[i-1] and nums[i] != nums[i+1]:
                return nums[i]
            else:
                continue

