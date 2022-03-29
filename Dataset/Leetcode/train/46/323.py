class Solution:
    def XXX(self, nums: list[int]) -> list[list[int]]:
        res = []
        track = []
        n = len(nums)

        def trackback(nums):
            if len(track) == n:
                res.append(track[::])
                return
            for i in range(n):
                if nums[i] not in track:
                    track.append(nums[i])
                else:
                    continue
                trackback(nums)
                track.pop()
        trackback(nums)
        return res

