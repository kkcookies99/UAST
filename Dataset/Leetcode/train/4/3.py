# 第k小数
class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        def getKthElement(k):
            """
            - 主要思路：要找到第 k (k>1) 小的元素,那么就取 pivot1 = nums1[k/2-1] 和 pivot2 = nums2[k/2-1] 进行比较
            - 这里的 "/" 表示整除
            - nums1 中小于等于 pivot1 的元素有 nums1[0 .. k/2-2] 共计 k/2-1 个
            - nums2 中小于等于 pivot2 的元素有 nums2[0 .. k/2-2] 共计 k/2-1 个
            - 取 pivot = min(pivot1, pivot2),两个数组中小于等于 pivot 的元素共计不会超过 (k/2-1) + (k/2-1) <= k-2 个
            - 这样 pivot 本身最大也只能是第 k-1 小的元素
            - 如果 pivot = pivot1,那么 nums1[0 .. k/2-1] 都不可能是第 k 小的元素。把这些元素全部 "删除",剩下的作为新的 nums1 数组
            - 如果 pivot = pivot2,那么 nums2[0 .. k/2-1] 都不可能是第 k 小的元素。把这些元素全部 "删除",剩下的作为新的 nums2 数组
            - 由于我们 "删除" 了一些元素（这些元素都比第 k 小的元素要小）,因此需要修改 k 的值,减去删除的数的个数
            """
            
            index1, index2 = 0, 0
            while True:
                # 特殊情况
                if index1 == m:
                    return nums2[index2 + k - 1]
                if index2 == n:
                    return nums1[index1 + k - 1]
                if k == 1:
                    return min(nums1[index1], nums2[index2])


                # 正常情况,index1,index2作为起始点,newindex1,newindex2作为比较点 在不停的更新
                newIndex1 = min(index1 + k // 2 - 1, m - 1)  # 第一种特殊情况,发生越界,记录需要比较的位置
                newIndex2 = min(index2 + k // 2 - 1, n - 1)  # 第一种特殊情况,发生越界,记录需要比较的位置
                pivot1, pivot2 = nums1[newIndex1], nums2[newIndex2]  # 获取两个需要比较的数
                if pivot1 <= pivot2:  # <=将两种情况合并
                    k -= newIndex1 - index1 + 1  # 两者相减后+1,这才是真正减去的长度
                    index1 = newIndex1 + 1  # 连同比较位置也一同删去了,所以新的开始是 比较位置 的后一位
                else:
                    k -= newIndex2 - index2 + 1
                    index2 = newIndex2 + 1
        
        m, n = len(nums1), len(nums2)
        totalLength = m + n
        if totalLength % 2 == 1:  # 可以将两种情况合并,奇数会求两次同样的k
            return getKthElement((totalLength + 1) // 2)
        else:
            return (getKthElement(totalLength // 2) + getKthElement(totalLength // 2 + 1)) / 2


