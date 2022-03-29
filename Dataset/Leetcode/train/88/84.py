 class Solution:
    def XXX(self, nums1: List[int], m: int, nums2: List[int], n: int) -> None:
        """
        Do not return anything, modify nums1 in-place instead.
        """
        if n==0:
            return 
        if m+n==1:
            if m==0 and n==1:
                nums1[0]=nums2[0]
            return 
        if m==1 and n==1:
            if nums1[0]<nums2[0]:
                nums1[1]=nums2[0]
                
            else:
                nums1.insert(0,nums2[0])
                nums1.pop()
            return 
        each1, each2 = 0, 0
        find = 0
        each=0
        while each < len(nums1):

            if nums1[each] > 0 and nums1[each + 1] == 0:
                find = each+1
                break
            each += 1
        for each in range(find,find+n,1):
            nums1.pop()


        while each1 < len(nums1) and nums2 !=[]:
            if nums1[each1] > nums2[0]:
                nums1.insert(each1,nums2[0])

                del nums2[0]
                each1+=1
                if nums2==[]:break
            else:

                if each1 + 1<len(nums1) and nums1[each1] <= nums2[0] and nums2[0] <= nums1[each1 + 1]:
                    nums1.insert(each1 + 1, nums2[0])

                    del nums2[0]
                each1 += 1



        for each in range(len(nums2)):
            nums1.insert(each1+1, nums2[each])

            each1 += 1

