 class Solution(object):
    def XXX(self, nums):
        res = []
        n = len(nums)
        if (not nums or n<3):
            return []  # nums为空或者长度小于3，返回[]
        nums.sort()
        for i in range(n):
            if nums[i]>0:
                return res
            
            if i>0 and nums[i]==nums[i-1]:   # 如果i的值相等
                continue;
            left = i + 1
            right = n - 1
            while left < right:
                if nums[i]+nums[left]+nums[right] == 0:
                    res.append([nums[i],nums[left],nums[right]])
                    while left<right and nums[left]==nums[left+1]:
                        left += 1
                    while left<right and nums[right]==nums[right-1]:
                        right -= 1
                    left += 1
                    right -= 1
                elif nums[i]+nums[left]+nums[right] >0:
                    right -= 1
                else:
                    left += 1
        return res

