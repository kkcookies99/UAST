 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        """
        [-4,-1,-1,0,1,2]
        [-2, -1, 0, 1, 2, 3]
        """
        if len(nums) < 3:
            return []
        
        nums.sort()
        n = len(nums)
        res = []
        for start in range(n-2):
            if start > 0 and nums[start] == nums[start-1]:
                continue
            
            end = n-1
            i = start+1
            while i < end:
                total = nums[start] + nums[i] + nums[end]
                if total < 0:
                    i += 1
                    while i < end and nums[i] == nums[i-1]:
                        i += 1
                elif total > 0:
                    end -=  1
                    while i < end and nums[end] == nums[end+1]:
                        end -= 1
                else:
                    res.append([nums[start], nums[i], nums[end]])
                    i += 1
                    while i < end and nums[i] == nums[i-1]:
                        i += 1
                    end -=  1
                    while i < end and nums[end] == nums[end+1]:
                        end -= 1
        return res

