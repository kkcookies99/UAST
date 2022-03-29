 def XXX(nums1, nums2):
    """
    :type nums1: List[int]
    :type nums2: List[int]
    :rtype: float
    """
    len1 = len(nums1)
    len2 = len(nums2)
    if (len1 == 0) & (len2 == 0):
        return 0
    if (len1 != 0) & (len2 == 0):
        if len1 % 2 == 0:
            return (nums1[len1 // 2 - 1] + nums1[len1 // 2]) / 2
        else:
            return nums1[len1 // 2]
    if (len1 == 0) & (len2 != 0):
        if len2 % 2 == 0:
            return (nums2[len2 // 2 - 1] + nums2[(len2 // 2)]) / 2
        else:
            return nums2[len2 // 2]
    a = 0
    b = 0
    num = []
    lens = len1 + len2
    for item in range(lens):
        if (nums1[a] <= nums2[b]) & (a < len1) & (b < len2):
            num.append(nums1[a])
            a = a + 1
        elif (nums1[a] > nums2[b]) & (a < len1) & (b < len2):
            num.append(nums2[b])
            b = b + 1
        elif a > len1:
            num.append(nums2[b])
            b = b + 1
        else:
            num.append(nums1[a])
            a = a + 1

    if lens % 2 == 0:
        return (num[lens // 2 - 1] + num[(lens // 2)]) / 2
    else:
        return num[lens // 2]


