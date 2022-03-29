 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        for index in range(len(nums) - 1):
            another_num = target - nums[index]
            if another_num in nums[(index + 1): ]:
                return [index, index + 1 + nums[(index + 1):].index(another_num)]
        return None

