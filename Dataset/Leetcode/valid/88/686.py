 class Solution(object):
    def XXX(self, nums1, m, nums2, n):
        """
        :type nums1: List[int]
        :type m: int
        :type nums2: List[int]
        :type n: int
        :rtype: None Do not return anything, modify nums1 in-place instead.

        核心思想：
                前提两个序列是按照从小到大排序好的
                对nums2进行倒序和nums1的数值进行倒序比较
                如果nums2[i]的数值大于nums1最大的值 则nums1[end]=nums[i]
                如果nums2[i]的数值小于nums1最大值，则先将nums1最大值排在序列末尾非0位置
                如果nums2[i]的数值小于num1某个值，则将nums1该值后移到序列末尾非0位置(非0位置可以用下标记录)

                实质上：就是比较nums1和nums2谁大，谁就置到末尾
        """
        if n == 0:
            return nums1
        if m == 0:
            nums1[:]=nums2[:]
            return nums1
        index = m + n - 1  # 记录末尾位置下标
        m,n = m - 1,n - 1 # nums1和nums2正确下标
        while m >= 0 and n >= 0:
            if nums1[m] > nums2[n]:
                nums1[index] = nums1[m]
                m = m - 1
            else:
                nums1[index] = nums2[n]
                n = n - 1
            index = index-1
        # 处理nums1被处理完nums2没被处理完的情况
        while n >= 0:
            nums1[index] = nums2[n]
            index,n = index-1,n-1
        return nums1

if __name__ == '__main__':
    s = Solution()
    print(s.XXX(nums1 = [2,0], m = 1, nums2 = [1], n = 1))

