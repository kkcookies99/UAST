 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []; nums = sorted(nums)
        n = len(nums)
        for i in range(n):
            if i > 0 and nums[i] == nums[i-1]: continue
            j = i + 1; k = n - 1
            while j < k:
                temp = [nums[i], nums[j], nums[k]]
                if sum(temp) == 0:
                    res.append(temp)
                    while j < k and nums[j] == nums[j+1]: j += 1
                    while j < k and nums[k] == nums[k-1]: k -= 1
                    j += 1; k -= 1
                else:
                    if sum(temp) > 0: k -= 1
                    else: j += 1
        return res

