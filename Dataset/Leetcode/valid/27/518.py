     class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        i = 0
        j = len(nums) - 1
        while i <= j:
            if nums[i] == val and nums[j] != val:
                nums[i], nums[j] = nums[j], nums[i]
            elif nums[i] == val and nums[j] == val:
                j -= 1
                continue
            elif nums[i] != val and nums[j] != val:
                i += 1
                continue
            i += 1
            j -= 1
        return j+1

