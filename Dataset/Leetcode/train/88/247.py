 class Solution(object):
    def XXX(self, nums1, m, nums2, n):
        if not nums2:
            return
        if nums1[m-1] < nums2[0]:  # 处理特殊情况1，nums1的最大值小于nums的最小值时，直接移过来
            nums1[m:] = nums2
            return
        if nums1[0] > nums2[-1]:    # 处理特殊情况2，nums1的最小值d大于nums的最大值时，直接移过来
            for i in range(m-1, -1, -1):
                nums1[-(m - i)] = nums1[i]
            nums1[:n] = nums2
            return
        i = m + n - 1
        while i >= 0 and nums2:
            if i - n < 0:  # i - n < 0 说明nums2中剩余的值比比nums1中的最小值还小了， 直接移过来
                nums1[:n] = nums2
                return
            if nums1[i - n] > nums2[n-1] :  # 将当前最大的移动到nums1
                nums1[i] = nums1[i-n]
            if nums1[i-n] <= nums2[n-1]: 
                nums1[i] = nums2[n-1]  # 将最大值赋值到nums1
                nums2.pop()  # 把nums中的最大值删除
                n -= 1  # 长度减一
            i -= 1

