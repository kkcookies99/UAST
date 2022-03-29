 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        l = len(nums)
        nums.sort()
        if l < 3:
            return []
        ans = []
        for i in range(l-2):
            if i > 0 and nums[i] == nums[ i -1] or nums[i] > 0:
                continue
            j ,k = i+ 1, l - 1
            target = -nums[i]
            while j < k:
                if nums[j] + nums[k] == target:
                    ans.append([nums[i], nums[j], nums[k]])
                    while j < l-1 and nums[j] == nums[j + 1]:
                        j += 1
                    while k> 0 and nums[k] == nums[k - 1]:
                        k -= 1
                    j, k = j + 1, k - 1
                elif nums[j] + nums[k] < target:
                    j += 1
                else:
                    k -= 1
        return ans

