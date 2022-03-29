 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        num3 = (nums1+nums2)
        num3.sort()
        a = len(num3)
        if a % 2:
            return(num3[a//2])
        else:
            return((num3[a//2]+num3[a//2-1])/2)

