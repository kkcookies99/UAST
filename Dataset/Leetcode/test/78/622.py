 class Solution(object):
    def XXX(self, nums):
        result = [[]]
        for i in range(len(nums)):
            temp = copy.deepcopy(result)
            for a in temp:
                a.append(nums[i])
            result.extend(temp)
        return result

