 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []
        if len(nums) <= 2 or max(nums) < 0 or min(nums) > 0:
            return res
        if min(nums) == 0 and max(nums) == 0:
            res.append([0,0,0])
            return res

        nums = sorted(nums)
        pos_0 = 0
        for i in range(len(nums)):
            if nums[i] >= 0:
                pos_0 = i
                break
        for i in range(pos_0+1):
            p, q = i+1, len(nums)-1
            while p < q:
                temp = nums[i]+nums[p]+nums[q]
                if temp == 0:
                    if [nums[i], nums[p], nums[q]] not in res:
                        res.append([nums[i], nums[p], nums[q]])
                    p += 1
                    q -= 1
                elif temp > 0:
                    q -= 1
                else:
                    p += 1
        
        return res

