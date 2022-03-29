 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        index1 = m-1
        index2 = n-1 
        for i in reversed(range(m+n)):
            if index1==-1:
                nums1[i] = nums2[index2]
                index2-=1
            elif index2==-1:
                nums1[i] = nums1[index1]
                index1-=1 
            else:
                if nums1[index1] >= nums2[index2]:
                    nums1[i] = nums1[index1]
                    index1-=1
                else:
                    nums1[i] = nums2[index2]
                    index2-=1


