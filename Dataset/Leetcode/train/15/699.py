 class Solution:
    def XXX(self,nums):
        lst = []
        for i in range(len(nums)):
            for j in range(len(nums)):
                for k in range(len(nums)):
                    if nums[i] + nums[j] + nums[k] == 0 and i != k and i != j and j != k:
                        a = [nums[i], nums[j], nums[k]]
                        a.sort()
                        if a not in lst:
                            lst.append(a)
        return lst

