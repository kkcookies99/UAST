class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        res=[]
        def dfs(l, num):
            if l==len(num):
                print(num)//测试语句
                res.append(num)
                return
            for r in range(l, len(num)):
                num[l], num[r] = num[r], num[l]
                dfs(l+1, num)
                num[l], num[r] = num[r], num[l]
        dfs(0, nums)
        print(res)
        return res

