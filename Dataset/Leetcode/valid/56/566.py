 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        # 先按照intervals的starti排序 sorted
        temp = sorted(intervals, key=lambda x:x[0]) 
        # 不断更新区间
        combine = temp[0]
        XXX = [combine]
        cnt = 0

        n = len(intervals)
        if(n < 2):
            return intervals

        for i in range(0, n-1):
            # 前后区间不重叠
            if(combine[1] < temp[i+1][0]):
                combine = temp[i+1]
                XXX.append(combine)
                cnt = cnt + 1
    
            # 前后区间重叠
            else:
                combine = [combine[0], max(combine[1], temp[i+1][1])]
                XXX[cnt] = combine
        return XXX

