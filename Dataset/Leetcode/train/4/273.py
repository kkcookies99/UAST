 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        s = nums1 + nums2
        s.sort()
        return (s[int((len(s) - 0.5) / 2)] + s[-int((len(s)+1) / 2) ]) / 2

