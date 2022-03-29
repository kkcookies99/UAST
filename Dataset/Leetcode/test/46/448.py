 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res = []
        track = []
        def backtrack(nums, track):
            if len(nums) == 0:
                res.append(track.copy())
            for i in range(len(nums)):
                track.append(nums[i])
                temp_nums = nums.copy()
                nums.pop(i)
                backtrack(nums, track)
                track.pop()
                nums = temp_nums.copy()
        backtrack(nums, track)
        return res


