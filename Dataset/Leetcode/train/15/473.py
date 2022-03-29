 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if len(nums)<3:return []
        ans=[]
        com=[]
        nums.sort()
        n=len(nums)-1
        def dfs(index):
            for i in range(index,n+1):
                com.append(nums[i])
                if len(com)==3 and sum(com)==0:
                    if not ans:ans.append(com.copy())
                    else:
                        if com not in ans:ans.append(com.copy())
                else:
                    dfs(i+1)
                com.pop()
        dfs(0)
        return ans

