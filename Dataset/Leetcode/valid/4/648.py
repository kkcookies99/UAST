 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        return sorted(nums1 + nums2)[len(nums1 + nums2) // 2] if len(nums1 + nums2) & 1 else (sorted(nums1 + nums2)[len(nums1 + nums2) // 2] + sorted(nums1 + nums2)[len(nums1 + nums2) // 2 - 1]) / 2

