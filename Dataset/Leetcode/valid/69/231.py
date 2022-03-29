class Solution(object):
    def XXX(self, x):
        """
        :type x: int
        :rtype: int
        """
        start=0
        end=x
        while(start<=end):
            mid=start+(end-start)/2
            if mid*mid<=x and (mid+1)*(mid+1)>x:
                return mid
            elif x<mid*mid:
                end = mid-1
            else:
                start=mid+1
        
                

