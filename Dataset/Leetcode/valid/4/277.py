```class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums1 = list(sorted(nums1+nums2))
        l= len(nums1)
        if l%2==0:
            ans = (nums1[int(l/2)]+nums1[int(l/2)-1])/2
        else:
            ans = nums1[int(l/2)]
        return ans

