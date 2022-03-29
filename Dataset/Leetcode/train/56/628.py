 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals, result = sorted(intervals, key=lambda item: item[0]), []
        for index in range(len(intervals)):
            if index == len(intervals)-1 or intervals[index+1][0] > intervals[index][1]:
                result.append(intervals[index])
                continue
            intervals[index+1] = [intervals[index][0], max(intervals[index][1], intervals[index+1][1])]
        return result

