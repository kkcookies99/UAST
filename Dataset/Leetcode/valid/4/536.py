 class Solution(object):
    def XXX(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        len1 = len(nums1)
        len2 = len(nums2)
        i=0;j=0
        res = []
        while(i<len1 and j<len2):
            if(nums1[i]<nums2[j]):
                res.append(nums1[i])
                i += 1
            else:
                res.append(nums2[j])
                j += 1
        while(i<len1):
            res.append(nums1[i])
            i += 1
        while(j<len2):
            res.append(nums2[j])
            j += 1
        dt = 0.0
        len3 = len(res)
        if(len3%2 == 0):
            dt = (float(res[(len3-1)//2])+float(res[len3//2]))/2
        else:
            dt = float(res[len3//2])
        return dt

