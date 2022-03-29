class Solution(object):
    def XXX(self, nums):
        sum=0
        max=-float('inf')
        for i in nums:
            sum+=i
            if sum> max :
                max=sum
            if sum<0 :
                sum=0
        return max

