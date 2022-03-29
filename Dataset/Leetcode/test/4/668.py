 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        for i in nums2:
            nums1.append(i)
        nums1.sort()
        if len(nums1)%2 == 0 :         
            number =(nums1[int(len(nums1)/2)] + nums1[int(len(nums1)/2 - 1)])/2
        else:
            a = len(nums1) - 1
            b = 2
            c = a/b
            number = nums1[int(c)]
        return number

