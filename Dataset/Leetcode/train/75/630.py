 class Solution:
    def XXX(self, nums: List[int]) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        p = 0
        q = len(nums)-1
        i = 0
        while i <= q:
            while nums[i] != 1:
                if nums[i] == 0:
                    nums[i], nums[p] = nums[p], nums[i]
                    p += 1
                    if p>i:
                        break
                if nums[i] == 2:
                    nums[i], nums[q] = nums[q], nums[i]
                    q -= 1
                    if q < i :
                        break
            i += 1

