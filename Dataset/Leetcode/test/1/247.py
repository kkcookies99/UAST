 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(len(nums)):
                if i == j:
                    continue
                else:
                    int(nums[i]) + int(nums[j]) == target
                    return [i,j]

