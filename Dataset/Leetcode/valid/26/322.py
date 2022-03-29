 class Solution:
    def XXX(self, nums: List[int]) -> int:
        l = -1
        try:
            while 1:
                if nums[l] == nums[l-1]:
                    nums.pop(l)
                else:
                    l -= 1
        except IndexError:
            return len(nums) 

