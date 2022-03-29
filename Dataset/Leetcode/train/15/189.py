 class Solution:
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        n = len(nums)
        res = []
        i = 0
        while i <= n-3:
            if i > 0 and nums[i] == nums[i-1]:
                i += 1
                continue
            if nums[i] > 0:
                break
            j = i+1
            k = n-1
            while j < k:
                t = nums[i]+nums[j]
                if  t > 0:
                    break
                else:
                    if nums[k] + t == 0:
                        res.append([nums[i],nums[j],nums[k]])
                        while nums[j]==nums[j+1]:
                            j += 1
                            if j >= k:
                                break
                        j += 1 
                        k -= 1
                    elif nums[k] + t > 0:
                        k -= 1
                    else:
                        j += 1
            i += 1
        return res
                  

