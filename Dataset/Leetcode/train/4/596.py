 class Solution:
    def XXX(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
       
        num = nums1+nums2
        #num = list(set(num))
        num.sort()
        length = len(num)
        if length%2== 0:
            media = (num[length//2-1]+num[length//2])/2
        else:
            media = num[length//2]
        return media

