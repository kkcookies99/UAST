class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        path,res= [],[]
        def backtrack(start):
            if len(path)==len(nums):
                res.append(path[:])
                return res
            # 每一层的元素允许比父节点的数字小，所以从0开始
            for i in range(len(nums)):
                #枝的去重
                if nums[i] not in path:
                    path.append(nums[i])
                    backtrack(i)
                    path.pop()
                    
        backtrack(0)
        return res

