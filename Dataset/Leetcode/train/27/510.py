 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        while val in nums:
            nums.pop(nums.index(val))
            nums.append('x')
        return len(nums)-nums.count('x')

