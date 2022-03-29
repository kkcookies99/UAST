 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        i = 0 
        nums_len = len(nums)
        while i < nums_len:
            for x in range(nums_len):
                if i != x and nums[i] + nums[x] == target:
                    return [i, x]
            else:
                i += 1

