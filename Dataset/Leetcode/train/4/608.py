 class Solution:
    def XXX(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        i = 0
        j = 0
        nums = []
        while i < len(nums1) and j < len(nums2):
            if nums1[i] < nums2[j]:
                nums.append(nums1[i])
                i += 1
            else:
                nums.append(nums2[j])
                j += 1
        if i != len(nums1):
            nums.extend(nums1[i: ])
        if j != len(nums2):
            nums.extend(nums2[j: ])
        
        length = len(nums)
        
        # if length is odd
        if length % 2 == 1:
            median = length // 2
            return nums[median]
        
        # if length is even
        median1 = length // 2 - 1
        median2 = length // 2
        return (nums[median1] + nums[median2]) / 2  

