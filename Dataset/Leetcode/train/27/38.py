 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        while (1):
            try:
                nums.remove(val)
            except (ValueError):
                return len(nums)

