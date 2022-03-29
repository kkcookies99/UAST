 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        intervals.sort()
        ans = []
        l, right_most = intervals[0]
        for start, end in intervals[1:]:
            if start > right_most:
                ans.append([l, right_most])
                l, right_most = start, end
            else:
                right_most = max(right_most, end)
        
        ans.append([l, right_most])
        return ans


undefined
for (i = 0; i < document.getElementsByTagName("code").length; i++) {     console.log(document.getElementsByTagName("code")[i].innerText); }


