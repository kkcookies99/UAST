 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        if nums1 or nums2:
            nums = sorted(nums1 + nums2)
            n = len(nums)
            if n%2 == 0:
                m = int(n/2 -1)
                n = m+1
                return (nums[m] + nums[n])/2
            else:
                m = n//2
                return nums[m]

