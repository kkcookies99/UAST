 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: int
        """
        up = len(nums) - 1
        down = 0
        mid = int(round((up+down)/2))

        while (up - down > 1):
            if(target == nums[mid]):
                return mid
            elif(target > nums[mid]):
                down = mid
                mid = int(round((up+down)/2))
            else:
                up = mid
                mid = int(round((up+down)/2))
        
        if(target == nums[up]):
            return up
        elif(target == nums[down]):
            return down
        elif(target > nums[up]):
            return up + 1
        elif(target < nums[down]):
            return down
        else:
            return up

