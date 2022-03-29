 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        length = len(nums1) + len(nums2) 

        ptr1 = 0 
        ptr2 = 0 
        loop = length // 2 + 1 
        res = [x for x in range(loop)]
        for i in range(int(loop)):
            if ptr1 == len(nums1) or ptr2 == len(nums2):
                if ptr1 == len(nums1) :
                    res[i] = nums2[ptr2]
                    ptr2 += 1 
                elif ptr2 == len(nums2):
                    res[i] = nums1[ptr1]
                    ptr1 += 1
            else:
                if nums1[ptr1] < nums2[ptr2]:
                    res[i] = nums1[ptr1]
                    ptr1 += 1 
                else:
                    res[i] = nums2[ptr2]
                    ptr2 += 1         
        if length % 2 == 0 :
            return (res[i] + res[i-1])/2.00000  
        else:
            return res[i]/1.00000

