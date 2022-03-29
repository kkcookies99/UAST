class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        def backtrace(idx, path):
            yield path
            for i in range(idx, len(nums)):
                yield from backtrace(i + 1, path + [nums[i]])
        return [*backtrace(0, [])]

