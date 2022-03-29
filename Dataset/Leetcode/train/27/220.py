 class Solution:
    def XXX(self, nums: List[int], val: int) -> int:
        idx = 0
        for i in range(len(nums)):
            if nums[i] != val:
                nums[idx],nums[i] = nums[i],nums[idx]
                idx += 1
        #print(nums)
        return idx

