 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        # dp
        dp = []
        single = []
        for interval in intervals:
            if len(dp) < interval[1]:
                dp += [0] *(interval[1] - len(dp))
            if interval[0] == interval[1] and interval[0] not in single:
                single.append(interval[0])
                continue
            dp[interval[0]:interval[1]] = [1] * (interval[1] - interval[0])
        res = []
        single.sort()
        i = 0
        while i < len(dp):
            start = i
            while i < len(dp) and dp[i] == 1:
                if single and single[0] == i:
                    single.pop(0)
                i += 1
            if i != start:
                res.append([start, i])
                if single and i == single[0]:
                    single.pop(0)
            elif single and i == single[0]:
                res.append([single[0], single[0]])
                single.pop(0)
            i += 1
        if single:
            res.append([single[0], single[0]])
        return res

