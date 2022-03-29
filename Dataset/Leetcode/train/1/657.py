 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        nums_dict = {}
        for i, v in enumerate(nums):
            if target - v in nums_dict:
                return [nums_dict[target - v], i]
            nums_dict[v] = i
        return None

