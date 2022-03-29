 class Solution:
    def XXX(self, nums: List[int]) -> int:

        u = 0
        for i in nums:
            if i != nums[u]:
                u += 1
                nums[u] = i

        return u + 1

