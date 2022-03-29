 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x: x[0])

        XXX = []
        for interval in intervals:
            if not XXX or XXX[-1][1] < interval[0]:
                XXX.append(interval)
            else:
                XXX[-1][1] = max(XXX[-1][1], interval[1])

        return XXX

