 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if len(nums)==0:
            return []
        if len(nums)==1:
            return [nums,[]]
        
        prev_ans=self.XXX(nums[:-1])
        answer=prev_ans.copy()
        for item in answer:
            item.append(nums[-1])
        prev_ans=self.XXX(nums[:-1])
        
        return answer+prev_ans

