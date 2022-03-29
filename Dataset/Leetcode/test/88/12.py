 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        tag = m + n
        mm = m
        if nums2:
            while tag > 1 and m > 0 and n > 0:
                if nums1[m-1] == -99:
                    m -= 1
                    continue
                if nums1[m-1] >= nums2[n-1]:
                    nums1[tag-1] = nums1[m-1]
                    nums1[m-1] = -99
                    m -= 1
                else:
                    nums1[tag-1] = nums2[n-1]
                    nums2[n-1] = -99
                    n -= 1
                tag -= 1
                
            print('nums1',[i for i in nums1])
            print('nums2',[i for i in nums2])

            for i in range(len(nums1)):
                if nums1[i] == -99 or mm == 0 or nums1[i] == 0:
                    for j in range(n):
                        if nums2[j] != -99:
                            nums1[i] = nums2[j]
                            nums2[j] = -99
                            break

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


