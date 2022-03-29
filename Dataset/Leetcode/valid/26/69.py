 class Solution:
    def XXX(self, nums: List[int]) -> int:
        if not nums:
            return 0
        i=0
        for data in nums[1:]:
            if nums[i]!=data:
                i+=1
                nums[i] = data
        return i+1

