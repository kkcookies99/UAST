class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        def backtrack(res, track, nums):
            if len(nums) == 0:
                res.append(track)
                print(res)
                return
            for i in range(len(nums)):
                track.append(nums[i])
                backtrack(res, track, nums[:i] + nums[i+1:])
                track.pop()

        res = []
        track = []
        backtrack(res, track, nums)
        return res

