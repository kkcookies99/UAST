class Solution:
    def XXX(self, nums: List[int]) -> int:
        max_=-1e10
        sum_=0
        for i in nums:
            sum_+=i
            max_=max(sum_,max_)
            if sum_<0:
                sum_=0
        return max_

