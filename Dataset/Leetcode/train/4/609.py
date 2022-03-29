 class Solution:
    def XXX(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        m, n = len(nums1), len(nums2)
        # swap to make sure n is larger
        if m > n: 
            nums1, nums2, m, n = nums2, nums1, n, m
        if n == 0:
            return None
        
        imin, imax, half_len = 0, m, (m + n + 1) // 2
        while imin <= imax:
            i = (imax + imin) // 2
            j = half_len - i
            # i is too small
            if i < m and nums1[i] < nums2[j-1]:
                imin += 1
            # i is too big
            elif i > 0 and nums1[i-1] > nums2[j]:
                imax -= 1
            # i is perfect
            else:
                if i == 0:
                    max_of_left = nums2[j-1]
                elif j == 0:
                    max_of_left = nums1[i-1]
                else:
                    max_of_left = max(nums1[i-1], nums2[j-1])
                # length is odd
                if (m + n) % 2 == 1:
                    return max_of_left
                
                # length is even
                if i == m:
                    min_of_right = nums2[j]
                elif j == n:
                    min_of_right = nums1[i]
                else:
                    min_of_right = min(nums1[i], nums2[j])
                return (max_of_left + min_of_right) / 2

