 class Solution:
    def XXX(self, nums: List[int]) -> int:
        ans, now = 0, None
        for i in range(len(nums)):
            if now != nums[i]:
                now = nums[i]
                nums[ans] = now
                ans += 1
        return ans

