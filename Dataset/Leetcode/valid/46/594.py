 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        if nums == []:
            return []
        if len(nums) == 1:
            t = []
            t.append(nums)
            return t
        res = []
        for i in nums: #i : int
            temp = nums.copy() #temp : list
            temp.remove(i)
            for j in self.XXX(temp):
                res.append([i]+j)
        return res

