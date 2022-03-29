class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        #返回全排列，本质就是找0-idx的全排列，
        ans = []
        lens = len(nums)
        if lens == 1:
            return [nums]
        if lens == 2:
            return [[nums[0],nums[1]],[nums[1],nums[0]]]
        #锁定一个作为head，然后递归其他的
        def dg(toshuffle):#锁定toshuffle的idx个作为head,得到的list
            if len(toshuffle) == 2:
                return [[toshuffle[0],toshuffle[1]],[toshuffle[1],toshuffle[0]]]
            tmp_res = []
            for i in range(len(toshuffle)):
                for ls in dg(toshuffle[:i]+toshuffle[i+1:]):
                    tmp_res.append([toshuffle[i]]+ ls)
            return tmp_res
        for i in range(len(nums)):
            for ls in dg(nums[:i]+nums[i+1:]):
                ans.append([nums[i]]+ls)
        return ans

             

