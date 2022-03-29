 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if  nums1 == [0]:
            nums1[0] = nums2[0]
            return 
        if n == 0 and m != 0:
            return 
        if m == n ==0:
            return 

        for i in range(m, m+n):
            nums1[i] = nums2[i - m]
            prev = i-1
            curr = i
            while nums1[prev] > nums1[curr] and prev >= 0 and curr >= 0 :
                nums1[prev], nums1[curr] = nums1[curr], nums1[prev]
                prev -= 1
                curr -= 1 

