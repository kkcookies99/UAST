 def XXX(self, nums1, nums2):
    """
    :type nums1: List[int]
    :type nums2: List[int]
    :rtype: float
    """
    
    def merge_sort(nums1, nums2):
        tmp = []
        while len(nums1) > 0 and len(nums2) >0:
            if nums1[0] <= nums2[0]:
                value = nums1.pop(0)
                tmp.append(value)                       
            else:
                value = nums2.pop(0)
                tmp.append(value)
        if nums1:
            tmp += nums1
        else:
            tmp += nums2 
        return tmp
    
    x, y = divmod(len(nums1) + len(nums2), 2)
    
    if y == 0:
        if nums1 and nums2:
            tmp = merge_sort(nums1, nums2)                                
            return (tmp[x-1]+tmp[x])/2.0
        elif nums1:
            return (nums1[x-1] + nums1[x])/2.0 
        elif nums2:
            return (nums2[x-1]+nums2[x])/2.0            
    else:
        if nums1 and nums2:
            tmp = merge_sort(nums1, nums2) 
            return tmp[x] * 1.0
        elif nums1:
            return nums1[x]*1.0
        elif nums2:
            return nums2[x]*1.0

