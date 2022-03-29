 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        return [(nums.index(i),nums.index(target-i,nums.index(i)+1)) for i in nums if (target-i) in nums[nums.index(i)+1:]][0]

