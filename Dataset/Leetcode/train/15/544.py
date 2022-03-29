 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        result = []
        if len(nums) < 3:
            return []
        else:
            for i1 in range(len(nums)-2):
                for i2 in range(i1+1, len(nums)-1):
                    for i3 in range(i2+1,len(nums)):
                        if nums[i1]+nums[i2]+nums[i3] == 0:
                            result.append([nums[i1],nums[i2],nums[i3]])
                            return result
                        else: return []

