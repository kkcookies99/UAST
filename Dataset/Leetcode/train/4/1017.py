 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        nums1.sort()
        n = len(nums1)
        if n == 1: return float(nums1[0])
        if n == 2: return sum(nums1)/2
        if n%2 == 0: return (nums1[n//2-1] + nums1[n//2])/2
        if n%2 ==1: return float(nums1[n//2])

