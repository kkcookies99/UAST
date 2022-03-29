class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        def maxSub(arr,lo,hi):
          if lo == hi:return arr[lo]
          mid = (lo+hi) // 2
          # 左最大
          left = maxSub(arr,lo,mid)        
          # 右最大
          right = maxSub(arr,mid+1,hi)  
          # 中间最大
          leftMid,rightMid = float("-inf"),float("-inf")
          tempL,tempR = 0,0
          for i in range(mid,lo-1,-1):
            tempL += arr[i]
            leftMid = max(leftMid,tempL)
          for i in range(mid+1,hi+1):
            tempR += arr[i]
            rightMid = max(rightMid,tempR)
          return max(left,right,leftMid+rightMid)
          
        return maxSub(nums,0,len(nums)-1)

