 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        len1 = len(nums1)
        len2 = len(nums2)
        lensum = len1 + len2
        i = 0
        j = 0
        curr = 0
        res = [0.0 for _ in range(lensum//2 + 1)]
        while (i + j) <= (lensum//2):
            if i < len1 and j < len2:
                if nums1[i] < nums2[j]:
                    res[curr] = nums1[i]
                    i += 1
                else:
                    res[curr] = nums2[j]
                    j += 1
            else:
                if i < len1:
                    res[curr] = nums1[i]
                    i += 1
                if j < len2:
                    res[curr] = nums2[j]
                    j += 1
            curr += 1
        if lensum % 2 : return res[curr - 1]/1.0
        else: return (res[curr - 1] + res [curr - 2])/2.0

