 class Solution:
    def XXX(self, nums: List[int]) -> None:
        count = [0,0,0]
        for n in nums:
            count[n] += 1
        for i in range(len(nums)):
            nums[:] = [0]*count[0]+[1]*count[1]+[2]*count[2]

