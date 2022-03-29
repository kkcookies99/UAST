 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        DICT = dict()
        for i in range(len(nums)):
            if (target - nums[i]) in DICT:
                j = DICT[target - nums[i]]
                if i != j:
                    return [i,j]
            DICT[nums[i]] = i

