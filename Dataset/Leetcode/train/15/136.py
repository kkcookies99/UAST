 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = list()
        nums.sort()
        for i in range(0, len(nums) - 2):
            if nums[i] > 0:
                break
            if i == 0 or nums[i] > nums[i - 1]:
                l = i + 1
                r = len(nums) - 1
                while l < r:
                    XXX = nums[i] + nums[l] + nums[r]
                    if XXX == 0:
                        res.append([nums[i], nums[l], nums[r]])
                    if XXX < 0:
                        while l + 1 < r:
                            l += 1
                            if nums[l] > nums[l - 1]:
                                break
                        else:
                            l += 1
                    else:
                        while r - 1 > l:
                            r -= 1
                            if nums[r] < nums[r+1]:
                                break
                        else:
                            r -= 1
        return res

