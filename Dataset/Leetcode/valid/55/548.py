 class Solution:
    def XXX(self, nums: List[int]) -> bool:
        size = len(nums)
        dist = 0
        for i, n in enumerate(nums):
            # i能跑多远，取决于dist有多远。牛逼
            if i <= dist:
                dist = max(i+n, dist)
                if dist >= size - 1:
                    return True
        return False

