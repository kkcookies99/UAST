class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        size = len(nums)
        res = []

        def dfs(idx, path):
            if idx == size:
                res.append(path)
                return
            for i in range(idx, size):
                nums[idx], nums[i] = nums[i], nums[idx]
                dfs(idx + 1, path + [nums[idx]])
                nums[idx], nums[i] = nums[i], nums[idx]
        dfs(0, [])
        return res

