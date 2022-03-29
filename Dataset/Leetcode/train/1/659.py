 class Solution(object):
    def XXX(self, nums, target):
        # 暴力解法
        for key, value in enumerate(nums):
            temp = target - value
            for key1, value in enumerate(nums):
                if key1 <= key:
                    continue
                elif temp == value:
                    return [key, key1]

