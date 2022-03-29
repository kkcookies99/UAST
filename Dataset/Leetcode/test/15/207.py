 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        result = []
        temp_result = set()
        hash_map = {nums[k]: k for k in range(len(nums))}
        for i in range(len(nums)-2):
            if nums[i] > 0:
                break
            if i != 0 and nums[i] == nums[i-1]:
                continue
            for j in range(i+1, len(nums)-1):
                if nums[j] > -nums[i]:
                    break
                if (-nums[i]-nums[j]) in hash_map and hash_map[-nums[i]-nums[j]] > j \
                        and ({nums[i], nums[j], -nums[i] - nums[j]} not in temp_result):
                    result.append([nums[i], nums[j], -nums[i]-nums[j]])
                    temp_result.add(frozenset({nums[i], nums[j], -nums[i]-nums[j]}))
        return result

