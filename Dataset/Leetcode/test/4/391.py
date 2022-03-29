 def XXX(self, nums1: List[int], nums2: List[int]) -> float:
    nums1.extend(nums2)
    nums1.sort()
    t = len(nums1)
    if t % 2 == 0:
        return (nums1[t//2-1] + nums1[t//2])/2.0
    else:
        return nums1[t//2]/1.0

