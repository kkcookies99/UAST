 class Solution(object):
    def XXX(self, nums, target):
        counter = {}
        for i, n in enumerate(nums):
            choice = target - n
            if choice in counter:
                return [i, counter[choice]]
            counter[n] = i

