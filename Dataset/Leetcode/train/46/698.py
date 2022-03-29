 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def dfs(old, new):
            if old == []:
                self.ans.append(new)
            for digit in old:
                dfs(list(set(old) - set([digit])), new+[digit])

        self.ans = []
        dfs(nums, [])
        return self.ans

