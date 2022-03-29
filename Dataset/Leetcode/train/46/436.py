 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def bt(nums, path):
            if len(path) == len(nums):
                res.append(copy.deepcopy(path))
            for i in range(len(nums)):
                if nums[i] not in path:
                    path.append(nums[i])
                    bt(nums, path)
                    path.pop()
        res = []
        bt(nums, [])
        return res

