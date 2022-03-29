 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        tag = [False for _ in range(len(nums))]
        res = []

        def dfs(i, tag, temp, res, nums):
            if len(temp) == len(nums):
                res.append(temp[::])
            for i in range(len(nums)):
                if not tag[i]:
                    temp.append(nums[i])
                    tag[i] = True
                    dfs(i + 1, tag, temp, res, nums)
                    temp.pop()
                    tag[i] = False

        dfs(0, tag, [], res, nums)
        return res

