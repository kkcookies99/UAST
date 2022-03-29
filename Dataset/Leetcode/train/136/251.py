class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        i = 0
        j = 1
        nums.sort()
        nlen = len(nums)
        res = 0
        while j < nlen:
            if nums[i] == nums[j]:
                i += 2
                j += 2
            else:
                break
        return nums[i]

