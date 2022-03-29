 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        # 合并完成后nums1的总长度是m+n，可以将大的元素存入最后，依次往前存入
        # 使用双指针算法
        p1 = m - 1
        p2 = n - 1
        k = 0
        while p1 >= 0 and p2 >= 0:
            if nums1[p1] > nums2[p2]:
                nums1[m+n-1-k] = nums1[p1]
                p1 -= 1
            else:
                nums1[m+n-1-k] = nums2[p2]
                p2 -= 1
            k += 1
        # 如果p2 >= 0 说明nums2[0..p2]的元素都比num1的小，直接将前面的元素替换就可
        while p2 >= 0:
            nums1[p2] = nums2[p2]
            p2 -= 1
        # 如果p1 >= 0 说明已经排好序了，不需要再做处理                

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


