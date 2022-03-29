 class Solution:
    def XXX(self, nums):
        length = len(nums)
        if length <=2:
            return []
        nums.sort()
        res = []
        for i in range(0,length-2):
            if i-1>=0 and nums[i] == nums[i-1]:
                continue
            l = i+1
            r = length-1
            while l<r:
                rr = nums[l]+nums[r]+nums[i]
                if rr == 0:
                    res.append([nums[i],nums[l],nums[r]])
                    while l<r and nums[l] == nums[l+1]:
                        l += 1
                    while l<r and nums[r] == nums[r-1]:
                        r -= 1
                    l += 1
                    r -= 1
                elif rr<0:
                    l += 1
                else:
                    r -= 1
        return res

