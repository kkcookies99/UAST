 class Solution(object):
    def XXX(self, nums, target):
        left, right = 0, len( nums) - 1
        while left < right:
            middle = ( left + right) / 2
            if nums[ middle] < target:
                left = middle + 1
            elif nums[ middle] > target:
                right = middle - 1
            else:
                return middle
        if nums[ left] < target:
            return left + 1
        return left 

