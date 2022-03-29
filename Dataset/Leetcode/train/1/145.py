 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        for i in nums:
            for j in nums:
                if i+j == target:
                    return [nums.index(i),nums.index(j)]
                    break

