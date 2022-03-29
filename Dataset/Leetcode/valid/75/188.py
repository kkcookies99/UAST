class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: None Do not return anything, modify nums in-place instead.
        """
        res = []
        count0 = 0
        count1 = 0
        count2 = 0
        for num in nums:
            if num==0:
                count0+=1
            elif num==1:
                count1+=1
            else:
                count2+=1
        res.extend([0, ] * count0)
        res.extend([1, ] * count1)
        res.extend([2, ] * count2)
        return res

