 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums3 = nums1+nums2
        nums3.sort()
        m  = len(nums3)
        n = (m-1)//2
        if m%2 == 0:
           return ((nums3[n]+nums3[n+1])/2)
        elif m%2 == 1:
            return (nums3[n])

