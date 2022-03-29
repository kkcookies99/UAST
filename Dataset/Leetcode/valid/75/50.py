class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        last = len(nums)-1
        middle = 0
        first = 0
        while middle <= last:
            if nums[middle] == 2:
                nums[middle], nums[last] = nums[last], nums[middle]
                last -= 1
            elif nums[middle] == 0:
                nums[first] = 0
                if middle > first:
                    nums[middle] = 1
                first += 1
                middle += 1
            else:
                middle += 1

