 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        for i,val1 in enumerate(nums):
            if target - val1 in nums:
                for j,val2 in enumerate(nums):
                    if val2 == target - val1 and i != j:
                        return i,j

