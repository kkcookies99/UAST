class Solution:
    def XXX(self, nums: List[int]) -> bool:
        length = len(nums)
        global tag
        tag = False
        def dfs(idx):
            if idx == length - 1:
                global tag
                tag = True
                return
            if idx >= length or nums[idx] < 1:
                return
            for i in range(1, nums[idx] + 1):
                dfs(idx + i)
            return
        dfs(0)
        return tag

