 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        if target > nums[-1]:
            return len(nums)
        else:
            i = 0
            while target > nums[i]:
                i = i+1
            if target == nums[i]:
                return i
            elif target <= nums[i]:
                nums.insert(i,target)
                return i

