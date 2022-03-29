 class Solution(object):
    def XXX(self, nums1, m, nums2, n):
        nums1[m:] = nums2[:n]
        for j in range(len(nums1)-1):
            for i in range(len(nums1)-j-1):
                if nums1[i]>nums1[i+1]:
                    a=nums1[i]
                    nums1[i]=nums1[i+1]
                    nums1[i+1]=a
                    i=i+1
            j=j+1
            
        
        return nums1

