 class Solution(object):
    def XXX(self, nums, target):
        self.nums=nums
        self.target=target
        l=len(self.nums)
       
        for m in (0,l-1):
            
            for i in (m+1,l):
           
              if self.nums[m]+self.nums[i]==self.target:
                    return [m,i]
            else:
                     continue

