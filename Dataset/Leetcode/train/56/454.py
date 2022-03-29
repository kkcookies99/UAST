 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        print(intervals)
        res = []
        i = 0 
        left = 0
        right = 1
        if len(intervals) == 1:
            return intervals
        if len(intervals) == 2 :
            if intervals[0][right] >= intervals[1][left]:
                res = [[intervals[0][left], max(intervals[0][right], intervals[1][right])]]
            else:
                res = intervals
            return res

        while i < len(intervals)-1 and len(intervals)>2:
            tmp_arr = [intervals[i][left]]
            maxx = intervals[i][right]
         
            if maxx >= intervals[i][left]:
                while maxx >= intervals[i+1][left]:
                    maxx = max(maxx, intervals[i+1][right])
                    i += 1 
                    if i == len(intervals)-1:
                        break
                
                print(maxx)
                tmp_arr.append(maxx)
            else: 
                tmp_arr.append(maxx)
            
            res.append(tmp_arr)
            
            tmp_arr = []
            i += 1 
        if i == len(intervals) -1 :
            if intervals[i][left] <= res[-1][right]:
                res[-1][right] = max(res[-1][right], intervals[i][right])

            else:
                res.append(intervals[i])
        return res

