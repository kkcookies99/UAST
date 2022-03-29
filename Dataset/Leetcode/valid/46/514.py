 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def backtrack(nums, track):
            if len(track) == len(nums):
                result.append(track[:])  # take care of this line
                return
            for i in range(len(nums)):
                if track.count(nums[i]):
                    continue
                track.append(nums[i])
                backtrack(nums, track)
                track.pop()
        tr = []
        result = []
        backtrack(nums, tr)
        return result

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


