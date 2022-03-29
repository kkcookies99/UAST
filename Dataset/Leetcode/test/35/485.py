 class Solution:
    def XXX(self, nums: List[int], target: int) -> int:
        """
        时间复杂度要求只能通过二分法求解
        """
        if target <= nums[0]:
            return 0
        elif target > nums[len(nums)-1]:
            return len(nums)
        elif target == nums[len(nums) - 1]:
            return len(nums) - 1
        else:
            n = 0
            l = len(nums) - 1
            m = (l+n)//2
            while 1:
                if target == nums[m]:
                    if target > nums[m-1]:
                        return m
                elif target < nums[m]:
                    if target > nums[m-1]:
                        return m
                    l = m
                    m = (l+n)//2
                else:
                    if target < nums[m+1]:
                        return m+1
                    n = m
                    m = (l+n)//2 

