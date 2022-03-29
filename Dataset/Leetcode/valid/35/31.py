 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        l, r = 0, len(nums)-1

        # 找到第一个大于或等于target的位置
        while l<r:
            m = (l+r) // 2
            if nums[m] >= target:
                r = m
            else:
                l = m + 1

        if nums[r] >= target:
            return r
        else:
            return r+1

