 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        res = []
        while nums1 and nums2:
            if nums1[0]<nums2[0]:
                res.append(nums1.pop(0))
            else:
                res.append(nums2.pop(0))
        if nums1:
            res.extend(nums1)
        elif nums2:
            res.extend(nums2)
        n = len(res)
        return res[n//2] if n % 2 == 1 else (res[n//2-1]+res[n//2])/2