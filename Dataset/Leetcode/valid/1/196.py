 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for idx,value in enumerate(nums):
            try:
                newidx = nums[idx+1:].index(target-value)
            except:
                newidx = -1
            if newidx >=0:
                return [idx,newidx+idx+1]


class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        for idx,value in enumerate(nums):
            try:
                newidx = nums.index(target-value)
            except:
                newidx = -1
            if idx!=newidx and newidx>0:
                return [idx,newidx]
        


class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        target_list = []
        for idx,value in enumerate(nums):
            for k,v in enumerate(target_list):
                if v==value:
                    return [k,idx]
            
            target_list.append(target-value)

