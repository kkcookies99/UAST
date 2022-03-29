    def XXX(self, nums1, nums2):
       """
       :type nums1: List[int]
       :type nums2: List[int]
       :rtype: float
       """
       nums1.extend(nums2)
       nums1.sort()  # 为什么要造轮子
       len1 =len(nums1)
       res = (nums1[len1//2]+nums1[(len1+1)//-2])/2.0 # 假设两个数组都不为空,这里就不会报错
       return res

