 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        nums.sort()
        res = []
        for i in range(n-2):
            left = i+1
            right = n-1
            if nums[i] > 0:
                return res
            if (nums[i]==nums[i-1]) and i>0:
                continue
            if nums[i] == 0:
                if nums[i] == nums[i+2]:
                    res.append([nums[i],nums[i+1],nums[i+2]])
                break
            while left < right:
                if nums[i]+nums[left]+nums[right] == 0:
                    res.append([nums[i],nums[left],nums[right]])
                    while left < right and nums[right] == nums[right-1]:
                        right -= 1
                    while left < right and nums[left] == nums[left+1]:
                        left += 1
                    left += 1
                    right -= 1
                elif nums[i]+nums[left]+nums[right] > 0:
                    #while left < right and nums[right-1] == nums[right]:
                    #    right -= 1
                    right -= 1
                else:
                    #while left < right and nums[left+1] == nums[i]:
                    #    left += 1
                    left += 1
        return res

