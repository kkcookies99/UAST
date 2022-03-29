 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        """
        if len(nums) == 1:
            return nums[0]
        else:
            lis = [0]
            for i in range(len(nums)-1):
                n = nums[i]
                lis.append(n)
                for num in nums[i+1:]:
                    lis.append(lis[-1] + num)
            lis.append(nums[-1])
            del lis[0]
            return max(lis)

