 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        nums1_len=len(nums1)
        nums2_len=len(nums2)
        merge_nums=[]
        i=0
        j=0
        while (i<nums1_len and j<nums2_len):
            if nums1[i] >nums2[j]:
                merge_nums.append(nums2[j])
                j+=1
            else:
                merge_nums.append(nums1[i])
                i+=1
        while (i< nums1_len):
            merge_nums.append(nums1[i])
            i+=1
        while (j< nums2_len):
            merge_nums.append(nums2[j])
            j+=1
        ret_len=len(merge_nums)
        x=ret_len//2
        if ret_len%2==0:
            return (merge_nums[x-1]+merge_nums[x])/2
        else:
            return merge_nums[x]



