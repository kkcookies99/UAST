 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        '''
        nums1[m:]=nums2
        nums1.sort()
        '''
        nums1[m:m+n]=nums2
        if m!=0 and n!=0:
            for j in range(m,m+n,1):
                i=j
                t=nums1[i]
                while i>=0:
                    if i==0:
                        nums1[i]=t
                        break
                    elif t<nums1[i-1]:
                        nums1[i]=nums1[i-1]
                        i=i-1
                    else:
                        nums1[i]=t
                        break
        
                

