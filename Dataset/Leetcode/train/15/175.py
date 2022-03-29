 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        n = len(nums)
        ans = []
        for i in range(n - 2):
            if i > 0 and nums[i] == nums[i - 1]:
                continue
            j, k = i + 1, n - 1
            while j < k:
                if nums[j] + nums[k] < -nums[i] or (j > i + 1 and nums[j] == nums[j - 1]):
                    j += 1
                    continue
                if nums[j] + nums[k] > -nums[i] or (k < n - 1 and nums[k] == nums[k + 1]):
                    k -= 1
                    continue
                ans.append([nums[i], nums[j], nums[k]])
                j += 1
                k -= 1
        return ans

