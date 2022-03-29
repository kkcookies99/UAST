 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        l = len(nums)
        for i in range(l-1):
            tmp = target - nums[i]
            if tmp in nums:
                j = nums.index(tmp)
                if i!=j:
                    return [i,j]
                elif tmp in nums[j+1:]:
                    return [i,j+1+nums[j+1:].index(tmp)]
            else:
                continue
        return []
