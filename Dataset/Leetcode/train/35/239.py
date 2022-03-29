 class Solution:
    def XXX(nums,target):
        for i in range(len(nums)):
            if nums[i]==target:
                return i
            if target not in nums:
                x=target
                nums.append(x)
                nums.sort()
                return nums.index(x)



