 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        if not nums:
            return 0
        
        a = nums.count(val)
        for i in range(a):
            nums.remove(val)

        return len(nums)

