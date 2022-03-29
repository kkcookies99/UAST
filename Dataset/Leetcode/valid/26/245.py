 class Solution:
    def XXX(self, nums):
        for b in nums[:]:
             c=nums.count(b)
             if c >1 :
                 nums.remove(b)
        return len(nums)

