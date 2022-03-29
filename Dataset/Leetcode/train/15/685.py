 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        '''
        双指针
        '''
        nums.sort()
        res = []

        for i in range(len(nums)):
            if i > 0 and nums[i] == nums[i-1]:
                continue 
            L = i + 1 
            R = len(nums) - 1 
            while L < R:
                if nums[i] + nums[L] + nums[R] > 0 :
                    R -=1 
                elif nums[i] + nums[L] + nums[R] < 0:
                    L += 1 
                else:
                    if L > i + 1 and nums[L] == nums[L-1]:
                        L += 1
                        continue 
                    else:
                        res.append([nums[i] , nums[L] , nums[R] ])
                        L += 1
                        R -=1 
        return res 

