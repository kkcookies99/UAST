 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        nums1_cp = nums1.copy()
        index_total = index1 = index2 = 0
        while index1 < m and index2 < n:
            if nums1_cp[index1] > nums2[index2]:
                nums1[index_total] = nums2[index2]
                index2 += 1
            else:
                nums1[index_total] = nums1_cp[index1]
                index1 += 1
            index_total += 1
        
        while index1 < m:
            nums1[index_total] = nums1_cp[index1]
            index1 += 1
            index_total += 1
        
        while index2 < n:
            nums1[index_total] = nums2[index2]
            index2 += 1
            index_total += 1

