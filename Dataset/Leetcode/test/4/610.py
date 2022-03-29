 class Solution:
    def XXX(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        a = 0
        b = 0
        i = 0
        tmp = 0
        ret = list()
        all_len = len(nums1) + len(nums2)
        if all_len%2 == 0 :
            a = all_len//2
            b = a - 1
        else :
            a = all_len//2
            b = a
        while i < (a+1):
            if 0 == len(nums1):
                ret.append(nums2[0])
                nums2.pop(0)
            elif 0 == len(nums2):
                ret.append(nums1[0])
                nums1.pop(0)     
            elif nums1[0] < nums2[0]:
                ret.append(nums1[0])
                nums1.pop(0)
            else:
                ret.append(nums2[0])
                nums2.pop(0)
            i = i + 1
        if a > b :
            return (ret[a]+ret[b])/2
        else:
            return ret[a]
        
        
        

