 class Solution(object):
    def XXX(self, nums):
        self.ret = []
        def dfs(path):
            if len(path) == len(nums):
                temp = []
                for i,n in enumerate(path):
                    if n==1:
                        temp.append(nums[i])
                    pass
                self.ret.append(temp)
                return
            path.append(0)
            dfs(path)
            path.pop()
            path.append(1)
            dfs(path)
            path.pop()
            pass
        dfs([])
        return self.ret

