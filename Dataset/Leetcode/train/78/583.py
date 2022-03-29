 class Solution(object):
    def XXX(self, nums):
        if not nums:
            return []
        if len(nums) == 1:
            return [[], nums]
        else:
            l = [[]]
            length = len(nums)
            for index in range(length):
                l.append([nums[index]])
                for j in  self.XXX(nums[index+1:]):
                    tmp = [nums[index]]
                    tmp.extend(j)
                    if tmp not in l:
                        l.append(tmp)
            return l

