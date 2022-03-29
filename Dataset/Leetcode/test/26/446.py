 class Solution:
    def XXX(self, nums: List[int]) -> int:
        nums.append(-100000)
        i = 0
        tmp = nums[-1]
        
        while nums[i] != tmp:
            if nums[i] == nums[i+1]:
                nums.pop(i+1)
            else:
                i = i + 1
        nums.pop()
        return len(nums)

