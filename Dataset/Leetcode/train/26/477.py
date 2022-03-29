 class Solution:
    def XXX(self, nums: List[int]) -> int:
        if not nums:
            return 0
        c = 0
        for f in nums:
            if f>nums[c]:
                if not c:
                    c = 1
                nums[c] =f
                c += 1
        return c + 1

