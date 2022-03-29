 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        nums = sorted(nums)
        res = []
        for i in range(len(nums) - 2):
            left = i + 1
            right = len(nums) - 1
            while left < right:
                sum = nums[i] + nums[left] + nums[right]
                if sum == 0:
                    val = sorted([nums[i], nums[left], nums[right]])
                    if val not in res: res.append(val)
                    while left < right and nums[left] == nums[left + 1]: left += 1
                    while left < right and nums[right] == nums[right - 1]: right -= 1
                    left += 1
                    right -= 1
                    continue
                if sum > 0:
                    right -= 1
                else:
                    left += 1

        return res

