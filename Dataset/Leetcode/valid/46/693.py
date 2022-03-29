 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        visit = [0]*n
        result=[]
        temp_p=[] #记录当前的排列
        self.backtrack(nums,n,0,visit,result,temp_p)
        return result
    def backtrack(self,nums,n,i,visit,result,temp_p):
        if i == n:
            result.append(temp_p.copy())
            return
        else:
            for j in range(n):
                if visit[j] == 0:#未被访问过
                    visit[j] = 1
                    temp_2 = temp_p.copy()
                    temp_2.append(nums[j])
                    self.backtrack(nums,n,i+1,visit,result,temp_2)
                    visit[j] = 0

