 class Solution(object):
    def XXX(self, nums, target):
        try:
            return nums.index(target)
        except:
            return bisect.bisect_left(nums, target)

