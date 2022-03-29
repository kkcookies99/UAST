 class Solution:
    def XXX(self, n: int) -> str:
        if(n==1):
            return "1"
        nums = "1"
        for i in range(n-1):
            length = 0
            pre = nums[0]
            newnums = ""
            for i in nums:
                if(i==a):
                    length += 1
                else:
                    newnums = newnums+str(length)+pre
                    pre = i
                    length = 1
            newnums = newnums+str(length)+pre
            nums = newnums
        return nums

