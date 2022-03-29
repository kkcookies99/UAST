 class Solution:
    def XXX(self, s: str, numRows: int) -> str:
        
        if numRows == 1:
            return s
        n = len(s)
        from collections import defaultdict
        res = defaultdict(list)

        line_id = 0
        direction = 1
        
        for idx, char in enumerate(s):
            res[line_id].append(char)
            if 0 < line_id < numRows-1 or idx == 0:
                line_id += direction
            elif line_id == numRows-1:
                direction = -direction
                line_id += direction
            else:
                direction = -direction
                line_id += direction
        
        return "".join(["".join(ii) for ii in list(res.values())])

