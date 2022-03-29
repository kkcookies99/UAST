 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        i = m - 1
        j = n - 1
        k = len(nums1) - 1

        while j >= 0 and i >= 0:
            if nums1[i] <= nums2[j]:
                nums1[k] = nums2[j]
                j -= 1
            else:
                nums1[k] = nums1[i]
                i -= 1
            k -= 1

        while k >= 0 and j >= 0:
            nums1[k] = nums2[j]
            j -= 1
            k -= 1

