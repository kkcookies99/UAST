 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        a = 0
        if nums:
            i, j = 0, len(nums) - 1
            while i <= j:
                if nums[i] == val:
                    if nums[j] == val:
                        j -= 1
                    else:
                        nums[i], nums[j] = nums[j], nums[i]
                else:
                    a += 1
                    i += 1
        return a

