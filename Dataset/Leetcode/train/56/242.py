 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals,ans = sorted(intervals),[]
        for i in range(len(intervals)):
            if ans and intervals[i][0] <= ans[-1][1]:
                ans[-1] = [ans[-1][0],max(ans[-1][1],intervals[i][1])]
            else:
                ans.append(intervals[i])
        return ans

