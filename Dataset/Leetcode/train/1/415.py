 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        remain = None
        for ind,value in enumerate(nums):
            remain = target - value
            if remain in remain_list:
                return(ind, nums.index(remain,ind+1))


