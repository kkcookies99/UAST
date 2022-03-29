 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        return (d := {}) or next(([d[num], i] for i, num in enumerate(nums) if num in d or d.setdefault(target - num, i) < 0))

