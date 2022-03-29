 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        length = len(nums)
        left = 0
        for right in range(length):  
            if nums[right]!=val:
                nums[left] = nums[right]
                left +=1 

        return left

