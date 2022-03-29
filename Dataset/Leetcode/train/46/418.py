 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        def backtrace(nums,track):
            if len(nums) == len(track):
                res.append(track[:])
                return
            for i in range(len(nums)):
                if nums[i] in track:
                    continue
                track.append(nums[i])
                backtrace(nums,track)
                track.remove(track[-1])
        
        track = []
        res = []
        backtrace(nums,track)
        return res

