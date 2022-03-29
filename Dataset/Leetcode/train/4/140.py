 def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        def findKthElement(arr1,arr2,k):
            len1,len2 = len(arr1),len(arr2)
            if len1 > len2:
                return findKthElement(arr2,arr1,k)
            if not arr1:
                return arr2[k-1]
            if k == 1:
                return min(arr1[0],arr2[0])
            i,j = min(k//2,len1)-1,min(k//2,len2)-1
            if arr1[i] > arr2[j]:
                return findKthElement(arr1,arr2[j+1:],k-j-1)
            else:
                return findKthElement(arr1[i+1:],arr2,k-i-1)
        l1,l2 = len(nums1),len(nums2)
        left,right = (l1+l2+1)//2,(l1+l2+2)//2
        return (findKthElement(nums1,nums2,left)+findKthElement(nums1,nums2,right))/2

