 class Solution(object):
    def XXX(self, intervals):
        s = sorted(intervals, key=lambda item:item[0])
        i = 0
        while i+1 <= len(s)-1:
            if s[i][1] >= s[i+1][0]:
                delet = s.pop(i)
                s[i][0] = delet[0]
                s[i][1] = max(delet[1], s[i][1])
            else:
                i += 1
        return s