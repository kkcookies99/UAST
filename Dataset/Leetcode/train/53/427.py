 class Solution(object):
    def XXX(self, nums):
        m,temp = nums[0],0
        for i in nums:
            if temp<0:
                temp = i  # 更新起点
            else:
                temp+=i
            m = max(m,temp)
        return m

