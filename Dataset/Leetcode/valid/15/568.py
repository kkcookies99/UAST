 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        if len(nums) < 3:
            return []
        tmp_map = {}
        for item in nums:
            tmp_map[item] = 1
        result = []
        for i in range(len(nums)):
            for j in range(i + 1, len(nums)):
                tmp = -(nums[j] + nums[i])
                if tmp in tmp_map:
                    if tmp != 0:
                        if tmp != nums[i] and tmp != nums[j]:
                            tmp_list = sorted([nums[i], nums[j], tmp])
                            if tmp_list not in result:
                                result.append(tmp_list)
                    else:
                        tmp_list = sorted([nums[i], nums[j], tmp])
                        if tmp_list not in result:
                            result.append(tmp_list)
        if nums.count(0) < 3 and [0,0,0] in result:
            result.remove([0,0,0])
        return sorted(result)

