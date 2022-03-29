 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []

        if len(nums) < 3:
            return []

        for i in range(len(nums)):
            if nums[i] > 0:
                break
            if i > 0 and nums[i] == nums[i-1]:
                continue

            left, right = i+1, len(nums) - 1
            while left < right:
                sum_3 = nums[i] + nums[left] + nums[right]
                if sum_3 == 0:
                    res.append([nums[i], nums[left], nums[right]])
                    while left < right and nums[left+1] == nums[left]:
                        left = left + 1
                    left = left + 1
                    while left < right and nums[right-1] == nums[right]:
                        right = right - 1 
                    right = right - 1
                    
                elif sum_3 < 0:
                    while left < right and nums[left+1] == nums[left]:
                        left = left + 1
                    left = left + 1
                else:
                    while left < right and nums[right-1] == nums[right]:
                        right = right - 1 
                    right = right - 1
        
        return res

