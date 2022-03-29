 class Solution:
    def XXX(self, s: str) -> int:
        maxValue = 0
        num = 0
        vs = 'IVXLCDM'
        values = [1,5,10,50,100,500,1000]
        sDict = {}
        for i in range(len(vs)):
            sDict[vs[i]] = i
        for i in range(len(s)-1, -1,-1):
            index = sDict[s[i]]
            if index>=maxValue:
                num += values[index]
                maxValue = index
            else:
                num -= values[index]
        return num

