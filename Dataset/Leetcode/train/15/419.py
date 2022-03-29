 class Solution(object):
    def generateQueryIndex(self, l):
        d = dict()
        for i, v in enumerate(l):
            if v in d:
                d[v].append(i)
            else:
                d[v] = [i]
        return d
    
    def preDelRep(self, sortedList):
        i=0
        j=1
        llen = len(sortedList)
        ret = []
        while j <= llen:
            if j == llen or sortedList[j] != sortedList[i]:
                t = j - i
                if t > 3:
                    t = 3
                for _ in range(t):
                    ret.append(sortedList[i])
                i = j
            j += 1
        return ret
                
    
    def getCIndex(self, queryDict, bIndex, c):
        if c not in queryDict:
            return -1
        if queryDict[c][-1] > bIndex:
            return queryDict[c][-1]
        return -1
    
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nlen = len(nums)
        resultList = []
        if nums is None or nlen < 3:
            return resultList
        nums.sort()
        nums = self.preDelRep(nums)
        nlen = len(nums)
        queryDict = self.generateQueryIndex(nums)
        aIndex = 0
        while aIndex < nlen and nums[aIndex] <=0:
            bIndex = aIndex + 1
            bUpper = (-0.5)*nums[aIndex]
            while bIndex < nlen and nums[bIndex] <= bUpper:
                c = -(nums[aIndex] + nums[bIndex])
                cIndex = self.getCIndex(queryDict, bIndex, c) #nums[bIndex+1:].index(c) + bIndex + 1
                if cIndex != -1:
                    resultList.append((nums[aIndex], nums[bIndex], c))
                bIndex += 1
            aIndex += 1
        resultList = list(set(resultList))
        resultList.sort()
        return resultList

