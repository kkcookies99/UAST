 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        nums1[m:m+n] = nums2      # 将nums2合并到nums1中
        nums1.sort()              # 直接使用内置排序方法sort

