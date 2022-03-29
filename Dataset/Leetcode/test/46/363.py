class Solution:
    def XXX(self, nums):
        ret = []
        path = []

        def dfs(li):
            if len(li) == len(path):
                ret.append(path[:])
            for i in li:
                if i not in path:
                    path.append(i)
                    dfs(li)
                    path.remove(i)
        dfs(nums)
        return ret

