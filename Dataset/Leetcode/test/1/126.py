 class Solution:
    def XXX(self, nums: List[int], target: int) -> List[int]:
        index_list = list(range(len(nums)))
        sorted_index = sorted(index_list, key=lambda x: nums[x])

        left = 0
        right = len(sorted_index) - 1
        while left <= right:
            if nums[sorted_index[left]] + nums[sorted_index[right]] == target:
                return [sorted_index[left], sorted_index[right]]
            elif nums[sorted_index[left]] + nums[sorted_index[right]] > target:
                right -= 1
            else:
                left += 1
        return []

