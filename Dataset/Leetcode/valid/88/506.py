 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        first = m-1
        end = m+n-1
        second = n-1
        while end >= 0:
            if first == -1:
                nums1[end] = nums2[second]
                second -= 1
            elif second == -1:
                break
            elif nums1[first] > nums2[second] :
                nums1[end] = nums1[first]
                first -= 1
            elif nums1[first] <= nums2[second]:
                nums1[end] = nums2[second]
                second -= 1
            end -= 1

