 class Solution:
    def XXX(self, intervals: List[List[int]]) -> List[List[int]]:
        lists=sorted(intervals,key=lambda x:x[0])
        i=0
        while i<len(lists)-1:
            if lists[i][1]>=lists[i+1][0]:
                lists[i]=[lists[i][0],max(lists[i][1],lists[i+1][1])]
                lists.pop(i+1)
            else:
                i+=1
        return lists

