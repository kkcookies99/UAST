class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        ans, length = [], len(nums)
        def dfs(i,tem_list):
            ans.append(tem_list)
            if i >= length:return
            for j in range(i,length):
                dfs(j+1,tem_list+[nums[j]])
        dfs(0,[])
        return ans

