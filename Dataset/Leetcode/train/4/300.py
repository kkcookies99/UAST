 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        nums1.sort()
        len_nums1 = len(nums1)
        if len_nums1%2 == 1:
            mid = float(nums1[int((len_nums1 - 1)/2)])
        else:
            mid = float((nums1[int(len_nums1/2)] + nums1[int(len_nums1/2 - 1)])/2)
        return mid

