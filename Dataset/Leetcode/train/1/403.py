 class Solution:
    def XXX(self, nums: List[int], target: int):
        for i in range(len(nums)):
            a = target - nums[i]
            for j in range(i+1,len(nums),1):
                if a == nums[j]:
                    return [i,j]

