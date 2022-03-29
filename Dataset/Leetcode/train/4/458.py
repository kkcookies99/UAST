 class Solution(object):
    def XXX(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        for i in nums2:
            nums1.append(i)
        nums1.sort()
        #print(self.nums1)
        lss=int(len(nums1))

        if lss%2 == 0:
            return float((nums1[lss/2-1]+nums1[lss/2]))/2   
        else:     
            return float(nums1[lss/2])

