 class Solution:
    def XXX(self, nums: List[int]) -> List[List[int]]:
        re = []
        if len(nums) == 0:
            re.append([])
            return re
        else:
            re_temp = self.XXX(nums[0:-1])
            k=len(re_temp)
            for i in range(k):
                t = []
                p = []
                for j in range(len(re_temp[i])):
                    t.append(re_temp[i][j])
                    p.append(re_temp[i][j])
                p.append(nums[-1])
                re.append(t)
                re.append(p)
            return re

