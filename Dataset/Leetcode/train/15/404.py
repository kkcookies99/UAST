 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums = sorted(nums)
        res = []
        for i in range(len(nums)-2):
            low = i+1
            high = len(nums)-1
            while low < high:
                tmp = nums[low]+nums[high]
                if tmp == -nums[i]:
                    new = [nums[i],nums[low],nums[high]]
                    if new not in res:
                        res.append(new)
                    low += 1
                else:
                    if tmp < -nums[i]:
                        low += 1
                    else:
                        high -= 1
        return res

