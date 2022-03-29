 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        while val in nums:
            for i in nums:
                if i == val:
                    nums.remove(i)
        return len(nums)

