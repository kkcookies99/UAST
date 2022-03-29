class Solution:
    def XXX(self, intervals):
        intervals.sort(key=lambda x: x[0])
        XXXd = []
        for interval in intervals:
            if not XXXd or XXXd[-1][-1] < interval[0]:
                XXXd.append(interval)
            else:
                XXXd[-1][-1] = max(XXXd[-1][-1], interval[-1])
        return XXXd

