 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        merged = nums1 + nums2
        index_nums1, index_nums2, index_merged = 0, 0, 0
        size_nums1, size_nums2 = len(nums1), len(nums2)
        size_merged = size_nums1 + size_nums2
        while index_nums1 < size_nums1 and index_nums2 < size_nums2:
            if nums1[index_nums1] < nums2[index_nums2]:
                merged[index_merged] = nums1[index_nums1]
                index_nums1 += 1
            else:
                merged[index_merged] = nums2[index_nums2]
                index_nums2 += 1
            index_merged += 1
        while index_nums1 < size_nums1:
            merged[index_merged] = nums1[index_nums1]
            index_merged += 1
            index_nums1 += 1
        while index_nums2 < size_nums2:
            merged[index_merged] = nums2[index_nums2]
            index_merged += 1
            index_nums2 += 1
        if size_merged%2:
            return merged[size_merged//2]
        else:
            return (merged[size_merged//2] + merged[size_merged//2-1])/2

