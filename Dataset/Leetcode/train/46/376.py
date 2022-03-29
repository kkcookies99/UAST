class Solution:
    def XXX(self,nums):
        res = []
        track = []
        def backtrack(nums,track):
            if len(track) == len(nums):
                res.append(track[:])
                return 
            for i in range(len(nums)):
                if nums[i] in track:
                    continue
                track.append(nums[i])
                backtrack(nums,track)
                track.pop()
        backtrack(nums,track)
        return res

