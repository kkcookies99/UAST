 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        nums1.sort()
        
        mid = int(len(nums1) / 2)
        if len(nums1) % 2 == 0:
            return (nums1[mid -1] + nums1[mid]) / 2
        else:
            return nums1[mid]

