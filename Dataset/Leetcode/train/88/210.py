 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        while nums2:
            left, right = 0, len(nums1) - len(nums2) - 1
            while left <= right:
                mid = (left + right) // 2
                if nums2[0] > nums1[mid]:
                    left = mid + 1
                elif nums2[0] < nums1[mid]:
                    right = mid - 1
                else:
                    left = mid
                    break
            nums1.pop(-1)
            nums1.insert(left, nums2.pop(0))

