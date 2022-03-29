 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        n = len(nums)
        result = []
        track = []
        def backtrack(track):
            if len(track)==len(nums):
                result.append(track[:]) # 这里如果是track就是错的
                return 0
            for i in nums:
                if i not in track:
                    track.append(i)
                    backtrack(track)
                    track.pop()
        backtrack(track)
        return result

