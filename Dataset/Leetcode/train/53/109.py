class Solution:
    def XXX(self, nums: List[int]) -> int:
        ans = []
        max = nums[0]
        for num in nums:
            ans.append(num)
            if sum(ans) > max:
                max = sum(ans)
            if sum(ans) < 0:
                ans = []
        return max

