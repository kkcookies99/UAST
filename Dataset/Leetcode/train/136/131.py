 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        nums.sort()
        nums.append("!")
        i = 0
        while True:
            if nums[i] == nums[i+1]:
                nums = nums[2:]
            else:
                return nums[i]
        

