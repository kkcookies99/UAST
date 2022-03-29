 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        nums1.sort()
        temp = len(nums1)
        if temp % 2 != 0:
            return nums1[temp//2]
        else:
            return (nums1[temp//2-1] + nums1[temp//2])/2

