 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort(key = lambda x: (x[0], x[1]))
        left, right = float('inf'), float('-inf')
        ret = []
        for cur_left, cur_right in intervals:
            if cur_left <= right:
                if cur_right > right:
                    right = cur_right
            else:
                if left != float('inf'):
                    ret.append([left, right])
                left, right = cur_left, cur_right
        ret.append([left, right])
        return ret

