class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        track = []
        self.res = []
        self.backtrack(nums,track)
        return self.res
    
    def backtrack(self,nums,track):
        if len(track) == len(nums):
            self.res.append(track[:])
            return
        for i in range(len(nums)):
            if nums[i] in track:
                continue
            track.append(nums[i])
            self.backtrack(nums,track)
            track.pop()

