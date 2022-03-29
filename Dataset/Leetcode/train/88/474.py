 class Solution(object):
    def XXX(self, nums1, m, nums2, n):
        pre = []
        p1 = 0
        p2 = 0
        while p1 <=m or p2 <= n:
            if p1<m and p2< n and nums1[p1] <= nums2[p2]:
                pre.append(nums1[p1])
                p1+=1
            elif p1<m and p2< n and nums1[p1] >= nums2[p2]:
                pre.append(nums2[p2])
                p2+=1
            elif p1 == m and p2 <n:
                pre.append(nums2[p2])
                p2+=1
            elif p2 == n and p1 <m:
                pre.append(nums1[p1])
                p1+=1
            elif p1 == m and p2 == n:
                break
        return pre

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


