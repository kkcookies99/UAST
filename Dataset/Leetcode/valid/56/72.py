class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key=lambda x: x[0])
        XXXd = []
        for interval in intervals:
            if not XXXd or XXXd[-1][-1] < interval[0]:
                XXXd.append(interval)
            else:
                XXXd[-1][-1] = max(XXXd[-1][-1], interval[-1]) #如果能连接上我们就连
        
        return XXXd

