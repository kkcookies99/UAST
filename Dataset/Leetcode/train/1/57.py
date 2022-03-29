 class Solution(object):
    def XXX(self, nums, target):
        index_List = []
        for i in range(len(nums)):
            for j in range(i+1, len(nums)):
                if nums[i] + nums[j] == target:
                    index_List.append(i)
                    index_List.append(j)
        return index_List

