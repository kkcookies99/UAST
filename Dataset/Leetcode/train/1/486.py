 class Solution(object):
    def XXX(self, nums, target):
        """
        :type nums: List[int]
        :type target: int
        :rtype: List[int]
        """
        i = 0
        j = len(nums) - 1
        if j < 1:
            return []
        sortednums = nums[:]
        sortednums.sort()
        while sortednums[i] + sortednums[j] != target:
            if sortednums[i] + sortednums[j] > target:
                j -= 1
            else:
                i += 1
        k = nums.index(sortednums[i])
        if sortednums[i] == sortednums[j]:
            l = k +nums[k+1:].index(sortednums[i])+1
        else:
            l = nums.index(sortednums[j])
        return [k,l]

