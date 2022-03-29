 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        for num in nums[:]:
            if num == val:
                nums.remove(num)
        return len(nums)

