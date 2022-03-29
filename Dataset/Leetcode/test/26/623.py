 class Solution:
    def XXX(self, nums: List[int]) -> int:
        m = len(nums)
        i,j = 0,1
        while j < m:
            if nums[j] == nums[i]:
                j +=1
            else:
                i += 1
                nums[i] = nums[j]
                j += 1
        return i+1

