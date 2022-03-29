 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        
        tail = 0
        for i in range(1, len(intervals)):
            cur_left, cur_right = intervals[i][0], intervals[i][1]
            pre_left, pre_right = intervals[tail][0], intervals[tail][1]
            if pre_right >= cur_left:
                intervals[tail][1] = max(pre_right, cur_right)
            else:
                tail += 1
                intervals[tail] = [cur_left, cur_right]
        
        for _ in range(len(intervals)-tail-1):
            intervals.pop()
        
        return intervals

