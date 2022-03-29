 class Solution:
    def XXX(self, s: str) -> int:
        ref = {'I':1, 'V':5, 'X':10, 'L':50, 'C':100, 'D':500, 'M':1000}
        intlist = list(map(lambda x: ref[x],s))
        for i in range(1,len(intlist)):
            if intlist[i] > intlist[i-1]:
                intlist[i] -= intlist[i-1]
                intlist[i-1] = 0
        return sum(intlist)

