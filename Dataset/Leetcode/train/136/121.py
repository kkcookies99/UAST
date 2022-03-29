 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums.sort()
        n = len(nums)
        if n <= 1:
            return nums[0]
        elif nums[0] != nums[1]:
            return nums[0]
        elif nums[n-1] != nums[n-2]:
            return nums[n-1]
        else:
            for i in range(2, n, 2):
                if nums[i] != nums[i+1]:
                    return nums[i]

