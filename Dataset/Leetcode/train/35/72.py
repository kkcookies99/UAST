 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        for i in range(0, len(nums)):
            if nums[i] == target:
                return i
            else:
                if target not in nums and len(nums)!=1 and nums[i-1]<target and nums[i] >target:
                    return i
                elif target not in nums and len(nums)!=1 and nums[0]>target:
                    return 0
                elif target not in nums and len(nums)!=1 and nums[-1]<target:
                    return len(nums)
                elif len(nums)==1 and target > nums[0]:
                    return len(nums)
                elif len(nums)==1 and target < nums[0]:
                    return 0

