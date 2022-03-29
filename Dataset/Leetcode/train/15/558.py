 class Solution(object):
    def XXX(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        nums.sort()
        sum_1=[]
        sum_2=[]
        sum_3=[]
        a=len(nums)
        for i in range(a-2):
            for j in range(i+1,a-1):
                for z in range(j+1,a):
                    if nums[i]+nums[j]+nums[z]==0:
                        sum_1.append(nums[i])
                        sum_1.append(nums[j])
                        sum_1.append(nums[z])
                        sum_1.sort()
                        sum_2.append(sum_1) # 将满足的放在sum_2中
                        sum_1=[]
        for i in sum_2:     # 将重复的剔除
            if i not in sum_3:
                sum_3.append(i)
        return sum_3

