 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals = sorted(intervals, key=lambda x: (x[0], x[1]))

        new_int = [intervals[0]]

        for i in range(1, len(intervals)):
            last_end = new_int[-1][-1]

            start, end = intervals[i]

            if start > last_end:
                new_int.append([start, end])
            else:  # start <= last_end
                if end <= last_end:
                    continue
                else:
                    new_int[-1][-1] = end

        return new_int


