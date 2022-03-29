 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums1.extend(nums2)
        nums1.sort()
        if len(nums1) % 2 == 0:  # 偶数个
            a = nums1[int(len(nums1) / 2) - 1]
            b = nums1[int(len(nums1) / 2)]
            return float(format((a+b)/2, '.5f'))
        else:
            a = nums1[int((len(nums1) - 1) / 2)]
            return float(format(a, '.5f'))

