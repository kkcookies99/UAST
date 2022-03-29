 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        k = 0
        i = 0
        if not nums2:
            nums1+=nums2
        else:
            while i<len(nums1) and k<len(nums2):
                if nums1[i]>nums2[k]:
                    for j in range(len(nums1)-1,i,-1):
                        tmp = nums1[j]
                        nums1[j] = nums1[j-1]
                        nums1[j-1] = tmp
                    nums1[i] = nums2[k]
                    k+=1
                i+=1
            while k<len(nums2):
                nums1[m+k]=nums2[k]
                k+=1

