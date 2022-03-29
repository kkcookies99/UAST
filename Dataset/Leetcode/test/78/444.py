 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        numslen=len(nums)
        data=[]
        if numslen==0:
            return [[]]
        for item in self.XXX(nums[:-1]):
            item.append(nums[-1])
            data.append(item)
        return self.XXX(nums[:-1])+data

