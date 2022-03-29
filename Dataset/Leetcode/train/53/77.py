class Solution:
    def XXX(self, nums: List[int]) -> int:
        #元素数量
        len_nums = len(nums)
        #最大值
        sum_max = nums[0]
        #计算结果
        sum_all = 0
        # 循环计算元素的数量
        for len_cal in range(1,len_nums+1):
            sum_all = 0
            # 循环计算元素构成组标记
            for sum_group in range(0,len_nums-len_cal+1):
                #将组中每个元素相加
                sum_all = 0
                for sum_group_item in range(0,len_cal):
                    sum_all = sum_all + nums[sum_group+sum_group_item]
                if sum_all > sum_max:
                    sum_max = sum_all
        return sum_max

