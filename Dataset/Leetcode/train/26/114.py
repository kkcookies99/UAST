 class Solution:
    def XXX(self, nums: List[int]) -> int:
        args=[]
        a=len(nums)-1
        for i in range(0,a):
            if nums[i]!=nums[i+1]:
                args.append(nums[i])
        args.append(nums[a])
        return len(args)

