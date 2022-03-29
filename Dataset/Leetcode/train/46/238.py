class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        path=[]
        res=[]
        def func(x):
            if x==len(nums):
                res.append(path[:])
                return
            for i in nums:
                if not i in path:
                    path.append(i)
                    func(x+1)
                    path.pop()
        func(0)
        return res

