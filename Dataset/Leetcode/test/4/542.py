 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:

        def find_k_smallest(k, ptr1, ptr2):
            if ptr1 >= len(nums1):
                return nums2[ptr2+k-1]
            if ptr2 >= len(nums2):
                return nums1[ptr1+k-1]
            if k == 1:
                return min(nums1[ptr1], nums2[ptr2])

            cmp1 = min(ptr1+k//2-1, len(nums1)-1)
            cmp2 = min(ptr2+k//2-1, len(nums2)-1)
            if nums1[cmp1] > nums2[cmp2]:
                k -= cmp2 - ptr2 + 1
                ptr2 = cmp2 + 1
                return find_k_smallest(k, ptr1, ptr2)
            else:
                k -= cmp1 - ptr1 + 1
                ptr1 = cmp1 + 1
                return find_k_smallest(k, ptr1, ptr2)
                    
        total = len(nums1)+len(nums2)
        if total%2 == 1:
            return find_k_smallest(total//2+1, 0, 0)
        else:
            return (find_k_smallest(total//2, 0, 0)+find_k_smallest(total//2+1,0,0))/2

