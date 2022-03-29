 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        d = {target - n: i for i, n in enumerate(nums)}
        return [[d[n], i] for i, n in enumerate(nums) if n in d and d[n] != i][0]

