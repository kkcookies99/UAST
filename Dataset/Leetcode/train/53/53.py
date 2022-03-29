class Solution:
    def XXX(self, nums: List[int]) -> int:
        start = 0
        ret = nums[0]
        for num in nums:
            start = max(start + num,num)
            ret = max(start,ret)
        return ret

