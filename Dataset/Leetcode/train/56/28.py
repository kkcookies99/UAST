class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        res = []
        for interval in intervals :
            res = self.insert(res, interval)
        return sorted(res)


    def insert(self, intervals: List[List[int]], newInterval: List[int]) -> List[List[int]]:
        return [ 
                x for x in intervals if x[1] < newInterval[0] or x[0] > newInterval[1] 
            ] + [[
                min(
                    [ newInterval[0] ] + [
                        x[0] for x in intervals if not (
                            x[1] < newInterval[0] or x[0] > newInterval[1]
                            )
                        ]
                ),max(
                    [ newInterval[1] ] + [
                        x[1] for x in intervals if not (
                            x[1] < newInterval[0] or x[0] > newInterval[1]
                            )
                        ]
                )
            ]]

