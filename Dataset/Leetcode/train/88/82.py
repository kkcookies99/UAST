 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        i = 0
        j = 0
        res = []
        while i < m and j < n:
            if nums1[i] <= nums2[j]:
                res.append(nums1[i])
                i += 1
            elif nums1[i] > nums2[j]:
                res.append(nums2[j])
                j += 1
        
        while i < m:
            res.append(nums1[i])
            i += 1

        while j < n:
            res.append(nums2[j])
            j += 1

        nums1[:] = res

