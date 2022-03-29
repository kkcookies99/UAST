 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums.sort()
        lens = len(nums)
        res = []
        for i in range(lens):
            if i == 0 or nums[i] > nums[i-1]:
                left = i + 1
                right = lens - 1
                while left < right:
                    sum = nums[i] + nums[left] + nums[right]
                    arr = []
                    if sum == 0:
                        arr += [nums[i], nums[left], nums[right]]
                        res.append(arr)
                        while left < right and (nums[left] == nums[left+1]):
                            left += 1
                        while left < right and (nums[right] == nums[right-1]):
                            right -= 1
                        
                        left += 1
                        right -= 1
                    elif sum > 0:
                        right -= 1
                    else:
                        left += 1
        return res```

