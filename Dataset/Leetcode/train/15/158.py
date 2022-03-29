 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        n=len(nums)
        lis=[]
        for i in range(n-2):
            for j in range(i+1,n-1):
                target = 0-nums[i]-nums[j]
                if  target in nums[j+1:]:
                    if [nums[i], nums[j], target] not in lis:
                        lis.append([nums[i], nums[j], target])
        return lis

