 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        n1,n2 = len(nums1),len(nums2)
        if n1>n2: nums1,nums2 = nums2,nums1
        if nums1:
            for i in nums1:
                bisect.insort(nums2,i)
        n = n1+n2
        return nums2[n//2] if n%2 else (nums2[n//2]+nums2[n//2-1])/2

