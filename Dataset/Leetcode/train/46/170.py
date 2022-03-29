class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        a = []
        def backtrack(path, rest):
            if rest == []:
                a.append(path)
                return
            for i in range(0, len(rest)):
                backtrack(path + [rest[i]], rest[:i] + rest[i+1:])
        backtrack([], nums)
        return a

