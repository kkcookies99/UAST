 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if not nums:
            return [[]]
        
        rec = []
        res = self.XXX(nums[1:])
        for r in res:
            rec.append(r)
            rec.append([nums[0]]+r)
        return rec

