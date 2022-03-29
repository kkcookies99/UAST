 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        c=nums1+nums2
        c.sort()
        if len(c)%2==1:
            a=int(len(c)/2)
            return c[a]
        else:
            a=len(c)/2
            b=a-1
            return (c[int(a)]+c[int(b)])/2

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


