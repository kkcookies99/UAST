 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        hash_nums = {}
        for index, num in enumerate(nums):
            another = target - num
            try:
                hash_nums[another]
                return [hash_nums[another],index]
            except KeyError:
                hash_nums[num] = index

