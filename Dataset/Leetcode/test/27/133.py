 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        low_index = 0
        high_index = len(nums) - 1
        while low_index <= high_index:
            if nums[low_index] == val:
                nums[low_index] = nums[high_index]
                high_index -= 1
            else:
                low_index +=1
        return low_index
                

