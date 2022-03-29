 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        end = len(nums)
        result = []
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            l, r = i + 1, end - 1
            rest = 0 - nums[i]
            while l < r:
                temp_sum = nums[l] + nums[r]
                if temp_sum == rest:
                    result.append([nums[i],nums[l],nums[r]])
                    while l < r and nums[l] == nums[l+1]: l += 1
                    while l < r and nums[r] == nums[r-1]: r -= 1
                    l += 1
                    r -= 1
                elif temp_sum > rest:
                    r -= 1
                elif temp_sum < rest:
                    l += 1
        return result

