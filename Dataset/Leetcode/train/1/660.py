 class Solution(object):
    def XXX(self, nums, target):
        # 空间换时间
        d = {}
        for key, value in enumerate(nums):
            temp = target - value
            if temp in d:
                return [key, d[temp]]
            d[value] = key

