 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        dic = {}
        start = []
        for i, j in intervals:
            if i not in dic:  
                dic[i] = j
                start.append(i)
            else:  #[0,3],[0,2]
                dic[i] = max(dic[i], j)
        start.sort()
        res = []
        for i in start:
            j = dic[i]
            if not res:
                res.append([i, j])
            else:
                a, b = res[-1]
                if a <= i <= j <= b:  # [1,4],[2,3]
                    continue
                if b < i:  # [8,10],[15,18]
                    res.append([i, j])
                else:  # [1,3],[2,6]
                    res.pop()
                    res.append([a, j])
        return res

