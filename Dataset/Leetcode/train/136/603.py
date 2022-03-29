 class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        p = 0
        while(p <= len(nums) - 1):
            num = nums[p]
            nums.remove(num)
            try:
                nums.remove(num)
            except:
                return num

