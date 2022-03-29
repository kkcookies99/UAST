 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        res = []
        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue
            if nums[i] > 0:
                break
            target = -nums[i]
            left, right = i + 1, len(nums) - 1
            while left < right:


                cur_sum = nums[left] + nums[right]
                if cur_sum > target:
                    right = right - 1
                    while left < right and nums[right] == nums[right+1]:
                        right = right - 1
                elif cur_sum < target:
                    left = left + 1
                    while left < right and nums[left] == nums[left-1]:
                        left = left + 1
                else:
                    res.append([-target, nums[left], nums[right]])
                    left = left + 1
                    right = right - 1
                    while left < right and nums[right] == nums[right+1]:
                        right = right - 1
                    while left < right and nums[left] == nums[left-1]:
                        left = left + 1
        return res```

