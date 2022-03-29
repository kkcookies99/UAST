 class Solution:
    def search_Insert(self, nums, target) -> int:
        start = 0
        end = len(nums) - 1
        while start <= end:
            mid = len(nums) // 2
            if target in nums:
                if nums[mid] == target:
                    return mid
                elif nums[mid] > target:
                    end = mid - 1
                else:
                    start = mid + 1
            else:
                nums.append(target)
                nums = sorted(nums)
                target_index = nums.index(target)
                return target_index

