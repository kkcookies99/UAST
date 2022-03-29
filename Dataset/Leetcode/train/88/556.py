 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        nums1_end_ptr, nums2_end_ptr, total_index = m - 1, n - 1, m + n -1
        while nums1_end_ptr >= 0 and nums2_end_ptr >= 0:
            if nums1[nums1_end_ptr] >= nums2[nums2_end_ptr]:
                nums1[total_index] = nums1[nums1_end_ptr]
                nums1_end_ptr -= 1
            else:
                nums1[total_index] = nums2[nums2_end_ptr]
                nums2_end_ptr -= 1
            total_index -= 1
        if nums2_end_ptr >= 0:
            nums1[:total_index+1] = nums2[:nums2_end_ptr+1]

