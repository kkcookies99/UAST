 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        nums_dict = {}
        ret = []
        for i in range(len(nums)):
            if target - nums[i] not in nums_dict:
                nums_dict[nums[i]] = i
            else:
                ret = [nums_dict.get(target - nums[i]), i]
                break
        return ret

