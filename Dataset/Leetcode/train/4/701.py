 class Solution:
    def XXX(self, nums1: list[int], nums2: list[int]) -> float:
        nums1 = nums1 + nums2
        nums1.sort(key=int)
        return nums1[(len(nums1)-1)//2] if len(nums1)%2==1 else (nums1[len(nums1)//2]+nums1[len(nums1)//2-1])/2

