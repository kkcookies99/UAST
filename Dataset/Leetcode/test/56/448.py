 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:

        ans = sorted(intervals, key=lambda x: x[0])

        i = 0
        while i < len(ans) - 1:
            if ans[i][1] >= ans[i + 1][0]:
                ans[i][1] = max(ans[i][1], ans[i + 1][1])
                del ans[i + 1]
            else:
                i += 1
            

        return ans

