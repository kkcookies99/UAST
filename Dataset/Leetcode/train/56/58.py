class Solution(object):
    def XXX(self, intervals):
        """
        :type intervals: List[List[int]]
        :rtype: List[List[int]]
        """
        #N = len(intervals)
        #一种是暴力解法O(N^2)
        #还可以先按第一个数的大小排序，然后依次判断。
        #特殊测试例：
        #
        #input: [[1,4],[2,3]]    
        #input: [[2,3],[4,5],[6,7],[8,9],[1,10]]

        ans = []
        intervals.sort(key = lambda x:x[0])
        i = 0
        
        while i < len(intervals):
            
            left = intervals[i][0]            
            right = intervals[i][1]          
            while i+1<= len(intervals)-1 and intervals[i+1][0]<=right:                                                   
                right = max(right,intervals[i+1][1])          
                i+=1         
            ans.append([left,right])              
            i+=1
        
        return ans

