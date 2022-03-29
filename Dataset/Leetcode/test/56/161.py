 class Solution(object):
    def XXX(self, intervals):
        """
        :type intervals: List[Interval]
        :rtype: List[Interval]
        """
        if intervals == []:
            return []
        intervals = sorted(intervals,key=lambda x:x.start)
        res = []
        tmp = intervals[0]
        for i in range(1,len(intervals)):
            if tmp.end >= intervals[i].start:
                tmp.end = max(tmp.end,intervals[i].end)
            else:
                res.append(tmp)
                tmp = intervals[i]
        res.append(tmp)
        return res

undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


