 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        l = len(nums)
        i = 0
        while l > i:
            if nums[i] == val:
                del nums[i]
                l -= 1
            else:
                i += 1
        return i

