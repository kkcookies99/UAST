 class Solution:
    def XXX(self, nums1: List[int], nums2: List[int]) -> float:
        sum_list = []
        for i in nums1:
            sum_list.append(i)
        for j in nums2:
            sum_list.append(j)
        # 排序 
        sum_list.sort()
        return sum_list[len(sum_list)//2] if len(sum_list)%2 != 0 else (sum_list[len(sum_list)//2-1]+sum_list[len(sum_list)//2])/2

